package com.pczapski.fibonacci;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

class FibonacciTest {

    Fibonacci fibonacci;

    void testFibonacci() {
        assertEquals(BigInteger.ZERO, fibonacci.fibonacci(0));
        assertEquals(BigInteger.ONE, fibonacci.fibonacci(1));
        assertEquals(BigInteger.ONE, fibonacci.fibonacci(2));
        assertEquals(BigInteger.valueOf(2), fibonacci.fibonacci(3));
        assertEquals(BigInteger.valueOf(3), fibonacci.fibonacci(4));
        assertEquals(BigInteger.valueOf(5), fibonacci.fibonacci(5));
        assertEquals(BigInteger.valueOf(8), fibonacci.fibonacci(6));
        assertEquals(BigInteger.valueOf(13), fibonacci.fibonacci(7));
        assertEquals(BigInteger.valueOf(21), fibonacci.fibonacci(8));
        assertEquals(BigInteger.valueOf(34), fibonacci.fibonacci(9));
        assertEquals(BigInteger.valueOf(55), fibonacci.fibonacci(10));
        assertEquals(BigInteger.valueOf(6765), fibonacci.fibonacci(20));
    }
}
