package com.javaTutorial.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 12;
	
	public String name;
	public String address;
	public transient int SSN;
	public int number;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}
