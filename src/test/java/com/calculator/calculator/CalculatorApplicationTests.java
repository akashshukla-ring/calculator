package com.calculator.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
	private CalculatorService calculatorService;

	@BeforeMethod
	public void setUp() {
		calculatorService = new CalculatorService();
	}

	@Test
	void contextLoads() {
	}

	@Test
	public void testAdd() {
		assertEquals(calculatorService.add(1, 2), 3.0);
	}

//	@Test
//	public void testAdd2() {
//		assertEquals(calculatorService.add(1, 4), 3.0);
//	}

}
