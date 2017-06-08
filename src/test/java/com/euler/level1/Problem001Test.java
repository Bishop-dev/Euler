package com.euler.level1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem001Test {

	private final Problem001 obj = new Problem001();

	@Test
	public void solution() throws Exception {
		assertEquals(23, obj.solution(10));
		assertEquals(233168, obj.solution(1000));
	}

}
