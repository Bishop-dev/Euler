package com.euler.level1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem003Test {

	private Problem003 obj = new Problem003();

	@Test
	public void test() {
		assertEquals(29, obj.solution(13195));
		assertEquals(6857, obj.solution(600851475143L));
	}

}