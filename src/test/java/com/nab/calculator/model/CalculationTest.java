package com.nab.calculator.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculationTest {

	private Calculation calculation;
	private List<Double> numbers;
	
	@Before
	public void setup()
	{
		numbers = new ArrayList<>(); 
	}
	
	@After
	public void tearDown()
	{
		numbers = null;
		calculation = null;
	}
	
	@Test
	public void shouldReturnCorrectOperationType() 
	{
		calculation = new Calculation(OperationType.ADDITION, numbers);
		Assert.assertEquals(OperationType.ADDITION, calculation.getOperationType());
	}
	
	@Test
	public void shouldReturnCorrectListOfNumbers()
	{
		numbers.add(1.0);
		numbers.add(2.0);
		calculation = new Calculation(OperationType.ADDITION, numbers);
		
		Assert.assertEquals(2, calculation.getNumbers().size());
		Assert.assertEquals(1, calculation.getNumbers().get(0), 0);
		Assert.assertEquals(2, calculation.getNumbers().get(1), 0);
	}

}
