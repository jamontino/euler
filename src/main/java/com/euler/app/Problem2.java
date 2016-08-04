package com.euler.app;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem2 {

    public int getSumOfFibonacciUnder(int maxLimit){
        int currentFib = 0;
        int sumOutput = 0;
        int seedVal1 = 0;
        int seedVal2 = 1;
        while (currentFib < maxLimit){
            currentFib = seedVal1 + seedVal2;
            seedVal1 = seedVal2;
            seedVal2 = currentFib;

            if(currentFib%2==0){
                sumOutput = sumOutput + currentFib;
            }
        }
        return sumOutput;
    }
}
