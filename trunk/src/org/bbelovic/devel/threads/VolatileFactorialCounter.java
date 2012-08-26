package org.bbelovic.devel.threads;

import static org.bbelovic.devel.threads.Factorial.factorial;

import java.math.BigInteger;

public class VolatileFactorialCounter implements FactorialCounter {

    private volatile VolatileCachedValue cachedValue;

    public BigInteger compute(int inputValue) {
        if (inputValue == cachedValue.getLastInputValue()) {
            return BigInteger.valueOf(cachedValue.getLastResult());
        }
        long newValue = factorial(inputValue);
        this.cachedValue = new VolatileCachedValue(newValue, inputValue);
        return BigInteger.valueOf(cachedValue.getLastResult());
    }

}
