package org.bbelovic.devel.threads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionWrapper implements Runnable {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private final int x = 10;

    @Override
    public void run() {
        try {
            System.out.println("Before await..");
            Thread.sleep(50 * 1000);
            System.out.println("After await..");
        } catch (final InterruptedException ie) {
            System.out.println("Caught interrupted exception..");
            ie.printStackTrace();
        } finally {

        }

    }

    public void signal() {
        lock.lock();
        try {
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public int getX() {
        return this.x;
    }
}
