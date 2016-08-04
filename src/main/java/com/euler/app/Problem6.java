package com.euler.app;

import java.util.stream.IntStream;

/**
 * Created by JamAyen on 4/8/2016.
 */
public class Problem6 {
    public double getSumSquareDifferenceOf(int maxDigit) {
        double squareOfSums = Math.pow(IntStream.rangeClosed(1, maxDigit).sum(),2);
        double sumOfSquares = IntStream.rangeClosed(1, maxDigit).reduce(0, (a2, b2) -> (b2 * b2) + a2);
        return squareOfSums - sumOfSquares;
    }

}
