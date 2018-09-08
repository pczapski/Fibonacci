package com.pczapski.fibonacci;

import org.junit.Test;

public class FibonacciRecursiveTest extends FibonacciTest {

    @Test
    public void fibonacci() {
        fibonacci = new FibonacciRecursive();
        testFibonacci();
    }
}