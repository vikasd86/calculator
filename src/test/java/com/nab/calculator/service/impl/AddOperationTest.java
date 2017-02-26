package com.nab.calculator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.operation.AddOperation;

public class AddOperationTest {

	private List<Double> numbers;
	private AddOperation addOperation;

	@Before
	public void setup() {
		numbers = new ArrayList<>();
		addOperation = new AddOperation();
	}

	@After
	public void tearDown() {
		numbers = null;
		addOperation = null;
	}

	@Test
	public void shouldAddNumbers() {
		numbers.add(2.0);
		numbers.add(3.4);
		Assert.assertEquals(5.4, addOperation.execute(numbers), 0);
	}

	@Test
	public void shouldReturnZeroIfNoNumberIsSupplied() {
		Assert.assertEquals(0, addOperation.execute(numbers), 0);
	}

	@Test
	public void shouldAddNegativeNumbers() {
		numbers.add(-2.0);
		numbers.add(3.4);
		Assert.assertEquals(1.4, addOperation.execute(numbers), 0);
	}
}
