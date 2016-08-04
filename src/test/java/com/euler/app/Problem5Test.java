package com.euler.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JamAyen on 4/8/2016.
 */
public class Problem5Test {

    Problem5 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem5();
    }

    @Test
    public void test_getSmallestNumberDivisibleUpTo_When10_Then2520() throws Exception {
        assertEquals(2520, testObj.getSmallestNumberDivisibleUpTo(10));
    }

    @Test
    public void test_getSmallestNumberDivisibleUpTo_When20_Then232792560() throws Exception {
        assertEquals(232792560, testObj.getSmallestNumberDivisibleUpTo(20));
    }
}
