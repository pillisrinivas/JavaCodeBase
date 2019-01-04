package com.java.concepts.collections.comparable;

//A class 'Movie' that implements Comparable 
public class Movies1 implements MovieType{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year 
//	public int compareTo(Movies1 m) {
//		System.out.println("compareTo output: " + (this.year - m.year));
//		return this.year - m.year;
//	}

	// Constructor
	public Movies1(String nm, double rt, int yr) {
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
}
