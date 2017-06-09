package com.euler.level1;

/**
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * https://projecteuler.net/problem=4
 */
public class Problem004 {

    public int solution(final int digits) {
        int start = 1;
        for (int i = 0; i < digits - 1; i++) {
            start *= 10;
        }
        int finish = start * 10;
        int result = 0;
        for (int i = finish; i > start; i--) {
            for (int j = finish; j > start; j--) {
                int number = i * j;
                if (isPalindrome(number) && result < number) {
                    result = number;
                }
            }
        }
        return result;
    }

    private boolean isPalindrome(final int number) {
        final String numberStr = Integer.toString(number);
        final String reverse = new StringBuilder(numberStr).reverse().toString();
        return reverse.equals(numberStr);
    }

}
