package com.nab.calculator.parser;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.nab.calculator.exception.InvalidInputException;
import com.nab.calculator.exception.InvalidOperandException;
import com.nab.calculator.exception.UnsupportedOperationException;
import com.nab.calculator.model.Calculation;
import com.nab.calculator.model.OperationType;
import com.nab.calculator.parser.InputParser;

public class InputParserTest {

	private InputParser inputParser;
	private String[] inputArray;

	@Before
	public void setUp() {
		inputParser = new InputParser();
	}

	@After
	public void tearDown() {
		inputParser = null;
		inputArray = null;
	}

	@Test
	public void shouldParse() {
		inputArray = new String[] { "1", "+", "3" };
		Calculation calculation = inputParser.parse(inputArray);
		Assert.assertEquals(OperationType.ADDITION, calculation.getOperationType());
		Assert.assertEquals(2, calculation.getNumbers().size());
		Assert.assertEquals(1, calculation.getNumbers().get(0), 0);
		Assert.assertEquals(3, calculation.getNumbers().get(1), 0);
	}

	@Test(expected = InvalidInputException.class)
	public void shouldNotParseWhenInputIsInvalid() {
		inputArray = new String[] { "1"};
		inputParser.parse(inputArray);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void shouldNotParseWhenUnsupportedOperationIsPassed()
	{
		inputArray = new String[] { "1", "^", "2" };
		inputParser.parse(inputArray);
	}
	
	@Test(expected = InvalidOperandException.class)
	public void shouldNotParseWhenInvalidOperandIsPassed()
	{
		inputArray = new String[] { "1", "+", "abcsde" };
		inputParser.parse(inputArray);
	}

}
