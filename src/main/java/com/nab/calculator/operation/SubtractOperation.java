package com.nab.calculator.operation;

import java.util.List;

public class SubtractOperation extends Operation {

	@Override
	public double execute(List<Double> numbers) {
		double result = 0;

		if (numbers != null && numbers.size() == 2) {
			result = numbers.get(0) - numbers.get(1);
		}
		return result;
	}
}
