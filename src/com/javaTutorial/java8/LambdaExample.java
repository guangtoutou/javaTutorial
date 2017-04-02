package com.javaTutorial.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExample {
	public static <T> List<T> filterNoEmpty(List<T> list, Predicate<T> p){
		List<T> results = new ArrayList<T>();
		for(T item:list)
			if (p.test(item)) results.add(item);
		
		return results;
	}
}
