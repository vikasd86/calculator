package com.nab.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

import com.nab.calculator.exception.InvalidInputException;

public class InvalidInputExceptionTest {

	@Test
	public void shouldReturCorrectErrorMessage() {
		InvalidInputException invalidInputException = new InvalidInputException();
		Assert.assertEquals("Invalid Input", invalidInputException.getMessage());
	}
}
