package com.euler.app;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.IntStream;

/**
 * Created by JamAyen on 3/8/2016.
 */
public class Problem4 {

    public int getLargestPalindromeForXDigits(int digits) {
        int seedValue = getDigitValue(digits);

        int largestPalindrome = 0;
        for(int val1=seedValue; val1 > 0; val1--){
            int currentPalindrome = getLargestPalindromeUsing(val1);
            largestPalindrome = largestPalindrome > currentPalindrome ? largestPalindrome : currentPalindrome;
        }

        return largestPalindrome;
    }

    private int getDigitValue(int digits) {
        return Integer.parseInt(StringUtils.rightPad("9",digits,"9"));
    }

    private int getLargestPalindromeUsing(int limit) {
        //can be improved further by reversing the iteration and get the first palindrome encountered (since that would naturally be the largest)
        return IntStream.rangeClosed(1, limit).reduce(0, (a,b) -> isPalindrome(b*limit) ? (b*limit) : a);
    }

    public boolean isPalindrome(int value) {
        return String.valueOf(value).equals(StringUtils.reverse(String.valueOf(value)));
    }
}
