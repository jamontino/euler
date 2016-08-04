package com.euler.app;

import java.util.stream.IntStream;

/**
 * Created by JamAyen on 4/8/2016.
 */
public class Problem5 {
    public int getSmallestNumberDivisibleUpTo(int maxDivisor) {
        int output = 0;
        int cyclingNumber = maxDivisor;
        while(output == 0 ){
            cyclingNumber = cyclingNumber + 1;
            if (isDivisibleUpTo(cyclingNumber, maxDivisor)){
                output = cyclingNumber;
            }
        }
        return output;
    }

    private boolean isDivisibleUpTo(int number, int maxDivisor) {
        return IntStream.rangeClosed(2, maxDivisor).allMatch(e -> number % e == 0);
    }
}
