package com.pczapski.fibonacci;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FibonacciStream implements Fibonacci {

    @Override
    public BigInteger fibonacci(int n) {

        return Stream
                .iterate(new BigInteger[]{BigInteger.ONE, BigInteger.ONE},
                        f -> new BigInteger[]{f[1], f[0].add(f[1])})
                .limit(n)
                .map(f -> f[0])
                .reduce((x, y) -> y)
                .orElse(BigInteger.ZERO);
    }
}
