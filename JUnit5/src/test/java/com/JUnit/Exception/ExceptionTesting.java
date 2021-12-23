package com.JUnit.Exception;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.JUnit.User.User;

public class ExceptionTesting {
	
	@Test
	void exceptionTesting() {
	    Exception exception = assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("1a");
	    });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}
	

}
