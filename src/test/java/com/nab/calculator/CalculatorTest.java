package com.nab.calculator;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.app.Calculator;
import com.nab.calculator.operation.AddOperation;
import com.nab.calculator.operation.DivideOperation;
import com.nab.calculator.operation.MultiplyOperation;
import com.nab.calculator.operation.SubtractOperation;

public class CalculatorTest {

	private Calculator calculator;
	private List<Double> numbers;
	
	@Before
	public void setUp() {
		numbers = new ArrayList<>();
	}

	@After
	public void tearDown() {
		calculator = null;
		numbers = null;
	}

	@Test
	public void shouldExecuteAddOperation() {
		
		numbers.add(2.0);
		numbers.add(4.5);
		calculator = new Calculator(new AddOperation(), numbers);
		
		Assert.assertEquals(6.5, calculator.calculate(), 0);
	}
	
	@Test
	public void shouldExecuteSubtractOperation() {
		
		numbers.add(2.0);
		numbers.add(1.5);
		calculator = new Calculator(new SubtractOperation(), numbers);
		
		Assert.assertEquals(0.5, calculator.calculate(), 0);
	}
	
	@Test
	public void shouldExecuteMultiplyOperation() {
		
		numbers.add(2.0);
		numbers.add(4.5);
		calculator = new Calculator(new MultiplyOperation(), numbers);
		
		Assert.assertEquals(9.0, calculator.calculate(), 0);
	}
	
	@Test
	public void shouldExecuteDivideOperation() {
		
		numbers.add(5.0);
		numbers.add(2.0);
		calculator = new Calculator(new DivideOperation(), numbers);
		
		Assert.assertEquals(2.5, calculator.calculate(), 0);
	}
	
}
