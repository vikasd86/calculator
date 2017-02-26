package com.nab.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

import com.nab.calculator.exception.CalcException;

public class CalculatorExceptionTest {

	@Test
	public void shouldSetTheExceptionMessage() {
		String errorMessage = "Test ArithmeticCalculator Exception";
		CalcException calcException = new CalcException(errorMessage);
		Assert.assertEquals(errorMessage, calcException.getMessage());
	}

}
