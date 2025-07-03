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
        assertEquals(1,new Calculator().addition("1,"));
    }
    @Test
    public void testMultipleNumbersString(){
        assertEquals(17,new Calculator().addition("4,5,7,1"));
        assertEquals(6,new Calculator().addition("1,3,0,2"));
        assertEquals(11,new Calculator().addition("11,,"));
    }
    @Test
    public void testNewLineNumberString(){
        assertEquals(7,new Calculator().addition("4\n2,1"));
        assertEquals(11,new Calculator().addition("11\n,,"));
    }


}