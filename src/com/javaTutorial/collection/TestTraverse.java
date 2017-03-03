package com.javaTutorial.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestTraverse {

	private List<String> strList = new ArrayList<String>();

	@Test
	public void ForeachTest() {
		for (String str : strList)
			System.out.println(str);
	}

	@Test
	public void IteratorTest() {
		for (Iterator<String> it = strList.iterator(); it.hasNext();)
			System.out.println(it.next());
	}

	@Test
	public void StreamTest() {
		strList.stream().filter(e -> e.equals("string 2")).forEach(e -> System.out.println(e));
	}

	public TestTraverse() {
		strList.add("string 1");
		strList.add("string 2");
		strList.add("string 3");

	}
}
