package com.pczapski.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class FibonacciIterationTest extends FibonacciTest {

    @Before
    public void setUp() {
        fibonacci = new FibonacciIteration();
    }

    @Test
    public void fibonacci() {
        testFibonacci();
    }
}