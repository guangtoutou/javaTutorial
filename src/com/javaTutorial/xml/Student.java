package com.javaTutorial.xml;

public class Student {
	private long id;
	private String firstName;
	private String lastName;
	private String nickName;
	private float marks;

	public Student(long id, String firstName, String lastName, String nickName, float mark) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.marks = mark;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public float getMark() {
		return marks;
	}

	public void setMark(float mark) {
		this.marks = mark;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
