package com.JUnit.OrderAnnotationDemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.JUnit.Calculator.Calculator;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotationDemo {
	
	@Test
	@Order(2)
	void firstOne() {
		Calculator cal = new Calculator();
		assertEquals(10,cal.multiply(5, 2));
	}
	
	@Test
	@Order(1)
	void secondOne() {
		Calculator cal = new Calculator();
		assertEquals(15,cal.multiply(5, 3));
	}
	
}
