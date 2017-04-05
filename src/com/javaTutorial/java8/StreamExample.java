package com.javaTutorial.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
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
	private List<Trader> traders;

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
		traders = Arrays.asList(raoul, mario, alan, brian);

		transactions = Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950));
	}

	// 1. Find all transactions in the year 2011 and sort them by value (small
	// to high).
	@Test
	public void practice1() {
		List<Transaction> list = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getValue)).collect(Collectors.toList());
		System.out.println(list);
	}

	// 2. What are all the unique cities where the traders work?
	@Test
	public void practice2() {
		List<String> list = traders.stream().map(Trader::getCity).distinct().collect(Collectors.toList());
		System.out.println(list);
	}

	// 3. Find all traders from Cambridge and sort them by name.
	@Test
	public void practice3() {
		List<Trader> list = traders.stream().filter(t -> t.getCity().equals("Cambridge"))
				.sorted((t1, t2) -> t1.getName().compareTo(t2.getName())).collect(Collectors.toList());
		System.out.println(list);
	}

	// 4. Return a string of all traders’ names sorted alphabetically.
	@Test
	public void practice4() {
		String result = traders.stream().map(Trader::getName).distinct().sorted().reduce("", (a, b) -> a + b);
		System.out.println(result);
	}

	// 5. Are any traders based in Milan
	@Test
	public void practice5() {
		Boolean result = traders.stream().anyMatch(((t) -> t.getCity().equals("Milan")));
		System.out.println(result);

	}

	// 6. Print all transactions’ values from the traders living in Cambridge
	@Test
	public void practice6() {
		List<Transaction> list = transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
				.collect(Collectors.toList());
		System.out.println(list);
	}

	// 7. What’s the highest value of all the transactions
	@Test
	public void practice7() {
		OptionalInt MaxValue = transactions.stream().mapToInt(Transaction::getValue).reduce(Integer::max);
		System.out.println(MaxValue);
	}

	// 8. Find the transaction with the smallest value
	@Test
	public void practice8() {
		Optional<Transaction> transaction = transactions.stream().min(Comparator.comparing(Transaction::getValue));
		System.out.println(transaction);
	}

}
