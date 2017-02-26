package com.nab.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

import com.nab.calculator.exception.DivideByZeroException;

public class DivideByZeroExceptionTest {

	@Test
	public void shouldReturCorrectErrorMessage() {
		DivideByZeroException dze = new DivideByZeroException();
		Assert.assertEquals("Division by zero is not allowed.", dze.getMessage());
	}

}
