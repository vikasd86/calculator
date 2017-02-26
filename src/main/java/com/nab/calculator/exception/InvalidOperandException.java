package com.nab.calculator.exception;

public class InvalidOperandException extends CalcException {

	private static final long serialVersionUID = -6798878116715918205L;

	public InvalidOperandException(String message) {
		super("Invalid Operand " + message);
	}
}
