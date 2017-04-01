package com.javaTutorial.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {
	public static List<Apple> filter(List<Apple> inventory, Predicate<Apple> p) {
		List<Apple> result = new ArrayList<Apple>();
		
		for (Apple apple : inventory)
			if (p.test(apple)){
				result.add(apple);
				System.out.println(apple.getColor() +" / "+ apple.getWeight());
			}
		return result;
	}
}
