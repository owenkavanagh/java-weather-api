package org.bbelovic.devel.threads.clients;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

    private final String url;
    private final int iterations;
    
    public Client(String url, int iterations) {
        this.url = url;
        this.iterations= iterations;
    }

    @Override
    public void run() {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            socket = new Socket(url, 8080);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            for (int i = 0; i < iterations; i++) {
                out.print("GET /unsynchronizedcounter HTTP/1.0 \r\n");
                out.print("\r\n");
                out.flush();
                System.out.println(in.readLine());
            }
        } catch (final IOException ioe) {
            System.out.println("Error in socket communication: " + ioe.getMessage());
        } finally {
            close(out);
            close(in);
        }
    }
    
    private void close(Closeable c) {
        try {
            c.close();
        } catch (final IOException ioe) {
            System.out.println("Error when closing streams: "+ ioe.getMessage());
        }
    }
}
