package com.euler.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem3Test {
    Problem3 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem3();
    }

    @Test
    public void test_getLargestPrimeFactorOf_When7_Return7() throws Exception {
        Assert.assertEquals(7, testObj.getLargestPrimeFactorAsInt(7));
    }

    @Test
    public void test_getLargestPrimeFactorOf_When10_Return5() throws Exception {
        Assert.assertEquals(5, testObj.getLargestPrimeFactorAsInt(10));
    }

    @Test
    public void test_getLargestPrimeFactorOf_When13195_Return29() throws Exception {
        Assert.assertEquals(29, testObj.getLargestPrimeFactorAsInt(13195));
    }

    @Test
    public void test_getLargestPrimeFactorOf_When600851475143_Return6857() throws Exception {
        Assert.assertEquals(6857, testObj.getLargestPrimeFactorAsInt(600851475143L));
    }
}
