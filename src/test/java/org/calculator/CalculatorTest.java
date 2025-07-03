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
        assertEquals(15,new Calculator().addition("11\n4"));
    }
    @Test
    public void testNewLineWithWhiteSpaceNumberString(){
        assertEquals(7,new Calculator().addition("4\n2, 1"));
        assertEquals(15,new Calculator().addition("11\n 4"));
    }

    @Test
    public void testCustomDelimiter() {
        assertEquals(3, new Calculator().addition("//;\n1;2"));
    }
    @Test
    public void testNegativeNumbersThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Calculator().addition("1, 3,-4");
        });
        assertTrue(exception.getMessage().contains("-4"));
    }
    @Test
    public void testIgnoreNumbersString() {
        assertEquals(3, new Calculator().addition("3,1003"));
        assertEquals(1002, new Calculator().addition("2,1000")); // 1000 is included
    }
    @Test
    public void testDelimiterOfAnyLength() {
        assertEquals(6, new Calculator().addition("//[***&]\n1***&2***&3"));
    }
    @Test
    public void testMultipleDelimiters() {
        assertEquals(6, new Calculator().addition("//[*][%]\n1*2%3"));
    }
    @Test
    public void testMultipleDelimitersOfAnyLength() {
        assertEquals(20, new Calculator().addition("//[**][%%]\n10** 2%% 8"));
    }


}