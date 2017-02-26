package com.nab.calculator.model;

import java.util.List;

public class Calculation {

	private OperationType operationType;
	private List<Double> numbers;

	public Calculation(OperationType operationType, List<Double> numbers) {
		super();
		this.operationType = operationType;
		this.numbers = numbers;
	}

	public OperationType getOperationType() {
		return operationType;
	}

	public List<Double> getNumbers() {
		return numbers;
	}
}
