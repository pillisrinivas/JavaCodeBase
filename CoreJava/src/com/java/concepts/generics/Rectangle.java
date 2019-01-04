package com.java.concepts.generics;

public class Rectangle extends Shape {
	private String str;

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void draw(Canvas c) {
		System.out.println("Drawing Rectangle!");
	}

}
