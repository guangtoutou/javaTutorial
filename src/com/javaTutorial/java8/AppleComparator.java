package com.javaTutorial.java8;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {

	@Override
	public int compare(Apple o1, Apple o2) {
		// TODO Auto-generated method stub
		if( o1.getWeight()>o2.getWeight()) return 1;
		if( o1.getWeight()<o2.getWeight()) return -1;
		return 0;
	}

}
