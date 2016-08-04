package com.euler.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem2Test {
    Problem2 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem2();
    }

    @Test
    public void test_getSumOfFibonacciUnder_When10_Return10() throws Exception {
        Assert.assertEquals(10, testObj.getSumOfFibonacciUnder(10));
    }

    @Test
    public void test_getSumOfFibonacciUnder_When40_Return44() throws Exception {
        Assert.assertEquals(44, testObj.getSumOfFibonacciUnder(40));
    }

    @Test
    public void test_getSumOfFibonacciUnder_When4mil_Return4613732() throws Exception {
        Assert.assertEquals(4613732, testObj.getSumOfFibonacciUnder(4000000));
    }
}
