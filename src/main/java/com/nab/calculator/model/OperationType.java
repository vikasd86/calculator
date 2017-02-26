package com.nab.calculator.model;

import java.util.HashMap;
import java.util.Map;

public enum OperationType {

	ADDITION("+"), SUBTRACTION("-"), DIVISION("/"), MULTIPLICATION("*");
	
	private static Map<String, OperationType> map = new HashMap<>();

	static {
        for (OperationType operationTypeEnum : OperationType.values()) {
            map.put(operationTypeEnum.operationSymbol, operationTypeEnum);
        }
    }
	
	private String operationSymbol;
	
	private OperationType(String operationSymbol)
	{
		this.operationSymbol = operationSymbol;
	}
	
	public static OperationType getValueOf(String operationSymbol) {
        return map.get(operationSymbol);
    }
}
