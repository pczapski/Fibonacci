package com.pczapski.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class FibonacciStreamTest extends FibonacciTest {

    @Before
    public void setUp() {
        fibonacci = new FibonacciStream();
    }

    @Test
    public void fibonacci() {
        testFibonacci();
    }
}