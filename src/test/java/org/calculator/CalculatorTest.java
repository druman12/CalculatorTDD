package org.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testEmptyString(){
        assertEquals(0,new Calculator().addition(""));
    }
}