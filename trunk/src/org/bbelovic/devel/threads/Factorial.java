package org.bbelovic.devel.threads;

public class Factorial {

    private Factorial() {
        
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
