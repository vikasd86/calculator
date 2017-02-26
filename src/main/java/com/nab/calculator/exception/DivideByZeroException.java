package com.nab.calculator.exception;

public class DivideByZeroException extends CalcException {

	private static final long serialVersionUID = -3281388508491756821L;

	public DivideByZeroException() {
		super("Division by zero is not allowed.");
	}

}
