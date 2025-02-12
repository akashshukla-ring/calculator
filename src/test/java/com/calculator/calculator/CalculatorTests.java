package com.calculator.calculator;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
@Test
public class CalculatorTests {

    private CalculatorService calculatorService;

    @BeforeMethod
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAdd() {
        assertEquals(calculatorService.add(1, 2), 3.0);
    }

    @Test
    public void testing2() {
        assertEquals(calculatorService.add(10, 2), 3.0);
    }

    @Test
    public void testSubtract() {
        assertEquals(calculatorService.subtract(5, 3), 2.0);
    }

    @Test
    public void testMultiply() {
        assertEquals(calculatorService.multiply(2, 3), 6.0);
    }

    @Test
    public void testDivide() {
        assertEquals(calculatorService.divide(6, 2), 3.0);
    }


    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculatorService.divide(1, 0);
    }
}
