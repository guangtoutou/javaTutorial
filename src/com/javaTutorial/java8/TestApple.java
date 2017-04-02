package com.javaTutorial.java8;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class TestApple {

	private List<Apple> inventory;

	@Before
	public void setUp() {
		inventory = new ArrayList<Apple>();
		inventory.add(new Apple("Green", 200));
		inventory.add(new Apple("Green", 180));
		inventory.add(new Apple("Red", 100));
		inventory.add(new Apple("Green", 80));
		inventory.add(new Apple("Yellow", 200));
		inventory.add(new Apple("Green", 250));
		inventory.add(new Apple("Green", 160));
		inventory.add(new Apple("Yellow", 20));
	}

	@Test
	public void testAppleFilter() {
		AppleFilter.filter(inventory, (Apple apple)->apple.getColor().equals("Green")&&apple.getWeight()>150);
	}

	@Test
	public void testAppleComparator() {
		Collections.sort(inventory, new AppleComparator());
		inventory.forEach(System.out::println);
	}
	

	
}
