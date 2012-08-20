package org.bbelovic.devel.threads;

public class VolatileCachedValue {

    private final long lastResult;
    private final int lastInputValue;

    public VolatileCachedValue() {
        this (0,0);
    }

    public VolatileCachedValue(long lastResult, int lastInputValue) {
        this.lastResult = lastResult;
        this.lastInputValue = lastInputValue;
    }

    public long getLastResult() {
        return this.lastResult;
    }

    public int getLastInputValue() {
        return this.lastInputValue;
    }
}
