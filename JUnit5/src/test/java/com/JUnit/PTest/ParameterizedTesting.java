package com.JUnit.PTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.JUnit.Calculator.Calculator;

public class ParameterizedTesting {
	
	public static int[][] data() {
        return new int[][] { { 1 , 2, 2 }, { 5, 3, 15 }, { 121, 4, 484 } };
    }
	
	@ParameterizedTest
	@MethodSource(value = "data")
	void testWithparameters(int[] data) {
		Calculator cal= new Calculator();
		int a= data[0];
		int b= data[1];
		assertEquals(data[2], cal.multiply(a, b));
		
	}

}
