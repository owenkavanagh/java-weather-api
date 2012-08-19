package org.bbelovic.devel.threads;

public class Main {

    public static void main(String[] args) {
//        final UnsafeCounter unsafeCounter = new UnsafeCounter();
//        Thread t1 = new Thread(new ThreadWorker(unsafeCounter));
//        Thread t2 = new Thread(new ThreadWorker(unsafeCounter));
//        Thread t3 = new Thread(new ThreadWorker(unsafeCounter));
//        Thread t4 = new Thread(new ThreadWorker(unsafeCounter));
//        Thread t5 = new Thread(new ThreadWorker(unsafeCounter));

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
        
    }
    
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative input is not defined.");
        }
        if (n == 0 || n == 1) {
            return 1L;
        } else {
            long pom = 1L;
            for (int i = 2; i <= n; i++) {
                pom *= i;
            }
            return pom;
        }
    }
}
