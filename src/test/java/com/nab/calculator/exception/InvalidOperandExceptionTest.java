package com.nab.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

import com.nab.calculator.exception.InvalidOperandException;

public class InvalidOperandExceptionTest {

	@Test
	public void shouldReturCorrectErrorMessage() {
		InvalidOperandException invalidOperandException = new InvalidOperandException("^");
		Assert.assertEquals("Invalid Operand ^", invalidOperandException.getMessage());
	}

}
