package com.pczapski.fibonacci;

import java.math.BigInteger;

public class FibonacciIteration implements Fibonacci {

    @Override
    public BigInteger fibonacci(int n) {

        if (n <= 0) return BigInteger.ZERO;
        if (n <= 2) return BigInteger.ONE;

        BigInteger sum = BigInteger.ZERO;

        BigInteger sumPrevious = BigInteger.ONE;
        BigInteger sumPreviousPrevious = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            sum = sumPreviousPrevious.add(sumPrevious);
            sumPreviousPrevious = sumPrevious;
            sumPrevious = sum;
        }

        return sum;
    }
}
