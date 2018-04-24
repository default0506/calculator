package com.cloudsoftware.calculator;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest{
	private Calculator calculator = new Calculator();
	
	@Test
	public void testMulti(){
		assertEquals(30, calculator.multi(5,6));
	}
}
