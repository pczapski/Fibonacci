package com.pczapski.fibonacci;

import java.math.BigInteger;

public class FibonacciRecursive implements Fibonacci {

    public BigInteger fibonacci(int n) {
        if (n <= 0) return BigInteger.ZERO;
        if (n <= 2) return BigInteger.ONE;

        return fibonacci(n - 1).add(fibonacci(n - 2));
    }
}
