package com.nab.calculator.exception;

public class UnsupportedOperationException extends CalcException {

	private static final long serialVersionUID = 3140875749823954071L;

	public UnsupportedOperationException(String message) {
		super("Unsupported Operation " + message);
	}
}
