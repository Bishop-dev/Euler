package com.euler.level1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem002Test {

    private Problem002 obj = new Problem002();

    @Test
    public void countFibonacci() throws Exception {
        assertEquals(4613732, obj.countFibonacci());
    }

}