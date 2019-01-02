package com.java.collections.listexamples;

public class Circle extends Shape {
	private String str;
	
	public Circle() {
		this.str = "No title";
	}
	
	public Circle(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void draw(Canvas c) {
		System.out.println("Drawing Circle: " + str);
	}
}
