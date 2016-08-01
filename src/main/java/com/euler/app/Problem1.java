package com.euler.app;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by JamAyen on 1/8/2016.
 * Problem Name : Multiples of 3 and 5
 */
public class Problem1 {

    public int getSumUsing(int input){
        return  getSumOfMultiplesUsing(input);
    }

    private int getSumOfMultiplesUsing(int input) {
        return IntStream.range(0, input).filter(element -> checkIfMultipleOf(element, 3,5)).sum();
    }

    private boolean checkIfMultipleOf(int i, Integer... multiples) {
        return Arrays.stream(multiples).anyMatch(element -> i%element == 0);
    }
}
