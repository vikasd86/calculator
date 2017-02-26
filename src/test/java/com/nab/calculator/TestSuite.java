package com.nab.calculator;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.nab.calculator.exception.CalculatorExceptionTest;
import com.nab.calculator.exception.DivideByZeroExceptionTest;
import com.nab.calculator.exception.InvalidInputExceptionTest;
import com.nab.calculator.exception.InvalidOperandExceptionTest;
import com.nab.calculator.exception.UnsupportedOperationExceptionTest;
import com.nab.calculator.model.CalculationTest;
import com.nab.calculator.model.OperationTypeTest;
import com.nab.calculator.parser.InputParserTest;
import com.nab.calculator.service.impl.AddOperationTest;
import com.nab.calculator.service.impl.DivideOperationTest;
import com.nab.calculator.service.impl.MultiplyOperationTest;
import com.nab.calculator.service.impl.SubtractOperationTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	CalculatorTest.class,
	CalculatorExceptionTest.class,
	DivideByZeroExceptionTest.class,
	InvalidInputExceptionTest.class,
	InvalidOperandExceptionTest.class,
	UnsupportedOperationExceptionTest.class,
	CalculationTest.class,
	OperationTypeTest.class,
	InputParserTest.class,
	AddOperationTest.class,
	DivideOperationTest.class,
	MultiplyOperationTest.class,
	SubtractOperationTest.class
	})
public class TestSuite {

}
