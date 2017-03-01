package com.javaTutorial.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		Calculator cal = new Calculator();
		cal.add(2);
		cal.add(3);
		assertEquals(5, cal.getResult());
	}

	@Test
	public void testSubstract() {
		Calculator cal = new Calculator();
		cal.add(8);
		cal.substract(6);
		System.out.println(cal.getResult());
		assertEquals(2, cal.getResult());
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
