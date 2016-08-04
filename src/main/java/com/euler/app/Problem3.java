package com.euler.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem3 {

    public int getLargestPrimeFactorAsInt(long value){
        return ((int) getPrimeFactorsOf(value).stream().mapToLong(element -> element).max().getAsLong());
    }

    private List<Long> getPrimeFactorsOf(long value) {
        List<Long> primeFactors = new ArrayList<>();
        while (value != 1){
            long factor = getSmallestFactorOf(value);
            primeFactors.add(factor);
            value = value/factor;
        }
        return primeFactors;
    }

    private long getSmallestFactorOf(long value) {
        return LongStream.rangeClosed(2, value).filter(element -> isElementAFactorOf(value,element)).findFirst().getAsLong();
    }

    private boolean isElementAFactorOf(long value, long element) {
        final long valueAsFinal = value;
        return valueAsFinal % element == 0;
    }
}
