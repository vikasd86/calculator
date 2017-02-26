package com.nab.calculator.exception;

import org.junit.Assert;
import org.junit.Test;

import com.nab.calculator.exception.UnsupportedOperationException;

public class UnsupportedOperationExceptionTest {

	@Test
	public void shouldReturCorrectErrorMessage() {
		UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("#");
		Assert.assertEquals("Unsupported Operation #", unsupportedOperationException.getMessage());
	}

}
