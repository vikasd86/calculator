package com.nab.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.exception.DivideByZeroException;
import com.nab.calculator.operation.DivideOperation;

public class DivideOperationTest {

	private List<Double> numbers;
	private DivideOperation divideOperation;

	@Before
	public void setup() {
		numbers = new ArrayList<>();
		divideOperation = new DivideOperation();
	}

	@After
	public void tearDown() {
		numbers = null;
		divideOperation = null;
	}

	@Test
	public void shouldDivideANumber() {
		numbers.add(4.0);
		numbers.add(2.0);
		Assert.assertEquals(2.0, divideOperation.execute(numbers), 0);
	}

	@Test(expected = DivideByZeroException.class)
	public void shouldThrowErrorWhenNumberIsDividedByZero() {
		numbers.add(4.0);
		numbers.add(0.0);
		divideOperation.execute(numbers);
	}

	@Test
	public void shouldReturnZeroIfNoNumberIsSupplied() {
		Assert.assertEquals(0, divideOperation.execute(numbers), 0);
	}

	@Test
	public void shouldDivideNegativeNumbers()
	{
		numbers.add(-24.0);
		numbers.add(6.0);
		Assert.assertEquals(-4.0, divideOperation.execute(numbers), 0);
	}
}
