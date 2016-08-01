package com.euler.app;

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
        return IntStream.range(0, input).filter(i -> checkIfMultipleOf3Or5(i)).sum();
    }

    private boolean checkIfMultipleOf3Or5(int i) {
        return i%3==0 || i%5==0;
    }
}
