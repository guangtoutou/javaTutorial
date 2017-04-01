package com.javaTutorial.java8;

public class Apple {
	private String color;

	private int weight;
	
	public Apple(String color, int weight){
		this.color = color;
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString(){
		return this.weight + this.color;
	}

}
