package com.nab.calculator.operation;

import java.util.List;

import com.nab.calculator.exception.DivideByZeroException;

public class DivideOperation extends Operation {

	@Override
	public double execute(List<Double> numbers) {

		double result = 0;

		if (numbers != null && numbers.size() == 2) {
			if (numbers.get(1) == 0) {
				throw new DivideByZeroException();
			}
			result = numbers.get(0) / numbers.get(1);
		}
		return result;
	}
}
