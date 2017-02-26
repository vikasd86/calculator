package com.nab.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.operation.MultiplyOperation;

public class MultiplyOperationTest {

	private List<Double> numbers;
	private MultiplyOperation multiplyOperation;

	@Before
	public void setUp() {
		numbers = new ArrayList<>();
		multiplyOperation = new MultiplyOperation();
	}

	@After
	public void tearDown() {
		numbers = null;
		multiplyOperation = null;
	}

	@Test
	public void shouldMultiplyNumbers() {
		numbers.add(2.0);
		numbers.add(3.0);
		Assert.assertEquals(6.0, multiplyOperation.execute(numbers), 0);
	}

	@Test
	public void shouldMultiplyNegativeNumbers() {
		numbers.add(-2.0);
		numbers.add(3.0);
		Assert.assertEquals(-6.0, multiplyOperation.execute(numbers), 0);
	}

	@Test
	public void shouldMultiplyFractionalNumbers() {
		numbers.add(0.4);
		numbers.add(0.3);
		Assert.assertEquals(0.12, multiplyOperation.execute(numbers), 0);
	}

	@Test
	public void shouldReturnZeroIfNoNumberIsSupplied() {
		Assert.assertEquals(0, multiplyOperation.execute(numbers), 0);
	}
}
