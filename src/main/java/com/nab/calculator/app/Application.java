package com.nab.calculator.app;

import java.util.List;

import com.nab.calculator.exception.CalcException;
import com.nab.calculator.model.Calculation;
import com.nab.calculator.model.OperationType;
import com.nab.calculator.operation.AddOperation;
import com.nab.calculator.operation.DivideOperation;
import com.nab.calculator.operation.MultiplyOperation;
import com.nab.calculator.operation.SubtractOperation;
import com.nab.calculator.parser.InputParser;

public class Application {

	public static void main(String[] args) {
		InputParser inputParser = new InputParser();
		try {
			Calculator calculator = null;

			/* Parse the input. */
			Calculation calculation = inputParser.parse(args);
			OperationType operationType = calculation.getOperationType();
			List<Double> numbers = calculation.getNumbers();

			if (OperationType.ADDITION.equals(operationType)) {

				calculator = new Calculator(new AddOperation(), numbers);

			} else if (OperationType.SUBTRACTION.equals(operationType)) {

				calculator = new Calculator(new SubtractOperation(), numbers);

			} else if (OperationType.MULTIPLICATION.equals(operationType)) {

				calculator = new Calculator(new MultiplyOperation(), numbers);

			} else if (OperationType.DIVISION.equals(operationType)) {

				calculator = new Calculator(new DivideOperation(), numbers);
			}

			double result = calculator.calculate();
			System.out.println(result);
		} catch (CalcException calcException) {
			System.err.println(calcException.getMessage());
		} catch (Exception exception) {
			System.err.println("Unknown error has occurred.");
		}
	}
}
