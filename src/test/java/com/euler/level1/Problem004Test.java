package com.euler.level1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem004Test {

    private Problem004 obj = new Problem004();

    @Test
    public void solution() throws Exception {
        assertEquals(9009, obj.solution(2));
        assertEquals(906609, obj.solution(3));
    }

}