package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testEmptyString(){
        assertEquals(0,new Calculator().addition(""));
    }
    @Test
    public void testSingleNumberString(){
        assertEquals(9,new Calculator().addition("9"));
        assertEquals(4,new Calculator().addition("4"));
    }
    @Test
    public void testDoubleNumbersString(){
        assertEquals(9,new Calculator().addition("4,5"));
        assertEquals(4,new Calculator().addition("1,3"));
    }

}