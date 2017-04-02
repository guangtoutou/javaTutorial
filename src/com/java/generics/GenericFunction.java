package com.java.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericFunction {
	
	//void
	public static <T> void execute(T t) {
		System.out.println(t.getClass().getName());
	}
	
	//return
	public static <T>  T execute(T t, int count){
		List<T> list = new ArrayList<T>();
		return t;
	}
}
