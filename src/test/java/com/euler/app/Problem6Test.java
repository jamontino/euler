package com.euler.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JamAyen on 4/8/2016.
 */
public class Problem6Test {

    Problem6 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem6();
    }

    @Test
    public void test_getSumSquareDifferenceOf_When10_Then2640() throws Exception {
        Assert.assertEquals(2640, testObj.getSumSquareDifferenceOf(10),0);
    }

    @Test
    public void test_getSumSquareDifferenceOf_When100_Then25164150() throws Exception {
        Assert.assertEquals(25164150, testObj.getSumSquareDifferenceOf(100),0);
    }

    @Test
    public void test_getSumSquareDifferenceOf_When1000_Then250166416500() throws Exception {
        Assert.assertEquals(2.501664165E11, testObj.getSumSquareDifferenceOf(1000),0);
    }
}
