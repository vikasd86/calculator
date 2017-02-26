package com.nab.calculator.parser;

import java.util.ArrayList;
import java.util.List;

import com.nab.calculator.exception.InvalidInputException;
import com.nab.calculator.exception.InvalidOperandException;
import com.nab.calculator.exception.UnsupportedOperationException;
import com.nab.calculator.model.Calculation;
import com.nab.calculator.model.OperationType;

public class InputParser {

	private final static String DECIMAL_NUMBER_REGEX = "[0-9]+[.]?[0-9]*";

	public Calculation parse(String[] inputArray) {

		/* Check whether input is a valid arithmetic operation. */
		if (inputArray.length != 3) {
			throw new InvalidInputException();
		}

		return parseArithmeticCalculation(inputArray);
	}

	private Calculation parseArithmeticCalculation(String[] inputArray) {
		String operationTypeAsStr = inputArray[1];
		OperationType operationType = OperationType.getValueOf(operationTypeAsStr);

		/* Check whether operation is supported. */
		if (operationType == null) {
			throw new UnsupportedOperationException(inputArray[1]);
		}

		validateNumber(inputArray[0]);
		validateNumber(inputArray[2]);

		double num1 = Double.parseDouble(inputArray[0]);
		double num2 = Double.parseDouble(inputArray[2]);

		List<Double> numbers = new ArrayList<>();
		numbers.add(num1);
		numbers.add(num2);

		return new Calculation(operationType, numbers);
	}

	private void validateNumber(String operand) {
		if (!operand.matches(DECIMAL_NUMBER_REGEX)) {
			throw new InvalidOperandException(operand);
		}
	}
}
