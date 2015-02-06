package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

private Calculator calculator;

@Before
public void setUp(){
	calculator = new Calculator();
}

@Test
public void addTest(){
	assertEquals(4, calculator.add(2,2));
}

@Test
public void subtract(){
	assertEquals(5, calculator.subtract(10, 5));
}
@Test
public void multiply(){
	assertEquals(6, calculator.multiply(3, 2));
}
@Test
public void divide(){
	assertEquals(2, calculator.divide(4, 2));
}
@Test
public void isTrue(){
	assertTrue(calculator.isEqual(2, 2));
}
@Test
public void isFalse(){
	assertFalse(calculator.isEqual(4, 3));
}

}
