package com.javaTutorial.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class TestSet {

	private Set<String> strList = new HashSet<String>();

	@Test
	public void ForeachTest() {
		Set<String> set = new TreeSet<String> (strList);
		
		
		for (String str : set)
			System.out.println(str);
	}

	public TestSet() {
		strList.add("string 1");
		strList.add("string 2");
		strList.add("string 3");
		strList.add("string 2");

	}
}
