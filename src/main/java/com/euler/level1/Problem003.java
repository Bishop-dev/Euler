package com.euler.level1;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 * https://projecteuler.net/problem=3
 */
public class Problem003 {

	public int solution(long number) {
		int result = 1;
		for (int i = 3; i <= number;) {
			if (number % i == 0) {
				number /= i;
				result = i;
			} else {
				i += 2;
			}
		}
		return result;
	}

}
