package org.bbelovic.devel.threads;

public class FactorialCounter {

    private volatile VolatileCachedValue cachedValue;

    public long doIt(int inputValue) {
        if (inputValue == cachedValue.getLastInputValue()) {
            return cachedValue.getLastResult();
        }
        long newValue = factorial(inputValue);
        this.cachedValue = new VolatileCachedValue(newValue, inputValue);
        return newValue;
    }

    private long factorial(int n) {
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
