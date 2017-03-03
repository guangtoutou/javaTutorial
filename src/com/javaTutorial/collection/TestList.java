package com.javaTutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;

public class TestList {
	private List<String> strList = new ArrayList<String>();

	@Test
	public void TestShuffule() {
		Collections.shuffle(strList);
		for(Iterator<String> it = strList.iterator();it.hasNext();)
			System.out.println(it.next());
	}

	public TestList() {
		strList.add("string 1");
		strList.add("string 2");
		strList.add("string 3");
		strList.add("string 4");
		strList.add("string 5");

	}
}
