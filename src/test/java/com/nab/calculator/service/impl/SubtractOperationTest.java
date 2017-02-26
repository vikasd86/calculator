package com.nab.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.operation.SubtractOperation;

public class SubtractOperationTest {

	private List<Double> numbers;
	private SubtractOperation subtractOperation;

	@Before
	public void setUp() {
		numbers = new ArrayList<>();
		subtractOperation = new SubtractOperation();
	}

	@After
	public void tearDown() {
		numbers = null;
		subtractOperation = null;
	}

	@Test
	public void shouldSubtractTwoNumbers() {
		numbers.add(3.0);
		numbers.add(2.0);
		Assert.assertEquals(1.0, subtractOperation.execute(numbers), 0);
	}

	@Test
	public void shouldSubtractNegativeNumbers() {
		numbers.add(-3.0);
		numbers.add(2.0);
		Assert.assertEquals(-5.0, subtractOperation.execute(numbers), 0);
	}

	@Test
	public void shouldReturnZeroIfNoNumberIsSupplied() {
		Assert.assertEquals(0.0, subtractOperation.execute(numbers), 0);
	}

}
