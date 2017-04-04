package com.javaTutorial.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class StreamExample {

	private List<Apple> inventory;

	private List<Dish> menu;

	private Trader raoul;
	private Trader mario;
	private Trader alan;
	private Trader brian;

	private List<Transaction> transactions;

	@Before
	public void setUp() {
		inventory = Arrays.asList(new Apple("Green", 200), new Apple("Green", 180), new Apple("Red", 100),
				new Apple("Green", 80), new Apple("Yellow", 200), new Apple("Green", 250), new Apple("Green", 160),
				new Apple("Yellow", 20));

		menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH));

		raoul = new Trader("Raoul", "Cambridge");
		mario = new Trader("Mario", "Milan");
		alan = new Trader("Alan", "Cambridge");
		brian = new Trader("Brian", "Cambridge");

		transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}

	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice1() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice2() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice3() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice4() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice5() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice6() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
	//1.Find all transactions in the year 2011 and sort them by value (small to high).
	@Test
	public void practice7() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear()==2011).sorted((t1,t2)->t1.getValue()-t2.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
	}
	
}
