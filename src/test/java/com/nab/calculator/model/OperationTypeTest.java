package com.nab.calculator.model;

import org.junit.Assert;
import org.junit.Test;

public class OperationTypeTest {

	@Test
	public void shouldReturnCorrectValueForAddOperation() {
		Assert.assertEquals(OperationType.ADDITION, OperationType.getValueOf("+"));
	}

	@Test
	public void shouldReturnCorrectValueForSubtractOperation() {
		Assert.assertEquals(OperationType.SUBTRACTION, OperationType.getValueOf("-"));
	}
	
	@Test
	public void shouldReturnCorrectValueForMultiplyOperation() {
		Assert.assertEquals(OperationType.MULTIPLICATION, OperationType.getValueOf("*"));
	}
	
	@Test
	public void shouldReturnCorrectValueForDivideOperation() {
		Assert.assertEquals(OperationType.DIVISION, OperationType.getValueOf("/"));
	}
	
	@Test
	public void shouldReturnNullForUnsupportedOperation()
	{
		Assert.assertEquals(null, OperationType.getValueOf("^"));
	}
}
