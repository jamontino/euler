package com.euler.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JamAyen on 1/8/2016.
 */
public class Problem1Test {

    Problem1 testObj;

    @Before
    public void setUp() throws Exception {
        testObj = new Problem1();
    }

    @Test
    public void getSumUsing_WhereInputIs10() throws Exception {
        assertEquals(23,testObj.getSumUsing(10));
    }

    @Test
    public void getSumUsing_WhereInputIs11() throws Exception {
        assertEquals(33,testObj.getSumUsing(11));
    }

    @Test
    public void getSumUsing_WhereInputIs1000() throws Exception {
        assertEquals(233168,testObj.getSumUsing(1000));
    }
}