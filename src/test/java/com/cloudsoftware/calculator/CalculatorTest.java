package com.cloudsoftware.calculator;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CalculatorTest{
	private Calculator calculator = new Calculator();
	
	@Test
	public void testMulti(){
		assertEquals(30, calculator.mul(5,6));
	}
	
	@Test
	public void testSum(){
		assertEquals(5, calculator.sum(2,3));
	}
}
