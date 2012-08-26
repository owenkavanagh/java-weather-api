package org.bbelovic.devel.threads;

import java.math.BigInteger;

public class SynchronizedFactorialCounter implements FactorialCounter {

    private int lastInputValue;
    private BigInteger lastValue;

    @Override
    public synchronized BigInteger compute(final int inputValue) {
            if (lastInputValue == inputValue) {
                return lastValue;
            } else {
                final long newValue = Factorial.factorial(inputValue);
                lastInputValue = inputValue;
                lastValue = BigInteger.valueOf(newValue);
                return lastValue;
            }
    }
}
