package com.euler.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem4Test {
    Problem4 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem4();
    }

    @Test
    public void test_getLargestPalindromeForXDigits_Using2_Return9009() throws Exception {
        assertEquals(9009, testObj.getLargestPalindromeForXDigits(2));
    }

    @Test
    public void test_getLargestPalindromeForXDigits_Using3_Return906609() throws Exception {
        assertEquals(9009, testObj.getLargestPalindromeForXDigits(2));
    }

    @Test
    public void test_isPalindrome_When123456_ReturnFalse() throws Exception {
        assertFalse(testObj.isPalindrome(123456));
    }

    @Test
    public void test_isPalindrome_When123321_ReturnTrue() throws Exception {
        assertTrue(testObj.isPalindrome(123321));
    }

    @Test
    public void test_isPalindrome_When1234321_ReturnTrue() throws Exception {
        assertTrue(testObj.isPalindrome(1234321));
    }
}
