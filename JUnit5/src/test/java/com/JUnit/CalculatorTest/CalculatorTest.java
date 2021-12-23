package com.JUnit.CalculatorTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.JUnit.Calculator.Calculator;

public class CalculatorTest {
	
	Calculator cal;
	
	@BeforeEach
	void setup() {
		cal=new Calculator();
	}
	
	@Test
	@DisplayName("Simple multiplication should work")
	void testMultiply() {
		assertEquals(20,cal.multiply(5, 4),"Regualar multiplication should work");
	}
	
	@RepeatedTest(5)
	@DisplayName("Ensure correct handling of zero")
	void testMultiplyByZero() {
		assertEquals(0,cal.multiply(5, 0),"it should be zero");
		assertEquals(0,cal.multiply(0, 5),"it should be zero");
	}
	

}
