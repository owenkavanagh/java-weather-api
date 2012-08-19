package org.bbelovic.devel.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class UnsafeCounterMoved {

    private final AtomicInteger counter = new AtomicInteger(0);
    
    public int getCounter() {
        return this.counter.get();
    }
    
    /**
     * This method increments counter safely.
     */
    public void doIt() {
        System.out.println(Thread.currentThread().getName() + ": counter "
                + counter.incrementAndGet());
    }
}
