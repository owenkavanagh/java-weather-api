package org.bbelovic.devel.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class UnsafeCounter {

    private final AtomicInteger counter = new AtomicInteger(0);
    
    public int getCounter() {
        return counter.get();
    }
    
    public void doIt() {
        System.out.println(Thread.currentThread().getName() + " counter "
                + counter.incrementAndGet());
    }
}
