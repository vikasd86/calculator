package com.nab.calculator.app;

import java.util.List;

import com.nab.calculator.operation.Operation;

public class Calculator {

	private Operation operation;
	private List<Double> numbers;
	
	public Calculator(Operation operation, List<Double> numbers) {
		super();
		this.operation = operation;
		this.numbers = numbers;
	}

	public double calculate()
	{
		return operation.execute(numbers);
	}
}
