package com.javaTutorial.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestMap {
	private List<String> strList;
	
	@Test
	public void test(){
		int a = 5;
		int b = 10;
		String c = (a+b==15)?"yes":"no";
		System.out.println(c);
	}
	
	@Test
	public void testPut(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s: strList){
			Integer freq = map.get(s);
			map.put(s, (freq==null)?1:freq+1);
		}
	}
	
	public TestMap() {
		strList = new ArrayList<String>();
		strList.add("string 1");
		strList.add("string 2");
		strList.add("string 3");
		strList.add("string 4");
		strList.add("string 5");
	}
}
