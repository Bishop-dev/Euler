package com.euler.level1;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Solution: http://www.mathblog.dk/project-euler-problem-1/
 *
 * https://projecteuler.net/problem=1
 */
public class Problem001 {

	private static final int MUL1 = 3;
	private static final int MUL2 = 5;

	public int solution(final int number) {
		return count(number, MUL1) + count(number, MUL2) - count(number, MUL1 * MUL2);
	}

	private int count(int number, final int arg) {
		if (number % arg == 0) {
			number--;
		}
		int tmp = number / arg;
		return arg * ( (tmp * tmp + tmp) / 2 );
	}

}
