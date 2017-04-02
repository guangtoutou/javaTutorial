package com.javaTutorial.java8;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestLambda {
	@Test
	//Predicate
	public void testFilterNoEmpty() {
		List<String> list = Arrays.asList("hello", "", "hello");
		System.out.println(LambdaExample.filterNoEmpty(list, (String s) -> !s.isEmpty()));
	}
}
