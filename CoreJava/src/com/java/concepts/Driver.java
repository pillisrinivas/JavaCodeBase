package com.java.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver1!");
		System.out.println("What's up?");
		

		System.out.println("Size of empty arraylist: " + astr.size());
		Driver drv = new Driver();
		String d = drv.toString();
		System.out.println("Value of toString: " + d);
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		Object obj1 = new Driver();
		System.out.println(obj1.getClass());
		ClassLoader loader;
		
//		Comparable and Comparator implementation
		
		ArrayList<Movie> list = new ArrayList<Movie>(); 
		list.add(new Movie("Force Awakens", 8.3, 2015)); 
		list.add(new Movie("Star Wars", 8.7, 1977)); 
		list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
		list.add(new Movie("Return of the Jedi", 8.4, 1983)); 

		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("============================================");
		System.out.println("Sorted by rating"); 
		System.out.println("============================================");
		RatingCompare ratingCompare = new RatingCompare(); 
		Collections.sort(list, ratingCompare); 
		for (Movie movie: list) 
			System.out.println(movie.getRating() + " " + 
							movie.getName() + " " + 
							movie.getYear()); 


		// Call overloaded sort method with RatingCompare 
		// (Same three steps as above) 
		System.out.println("============================================");
		System.out.println("\nSorted by name"); 
		System.out.println("============================================");
		NameCompare nameCompare = new NameCompare(); 
		Collections.sort(list, nameCompare); 
		for (Movie movie: list) 
			System.out.println(movie.getName() + " " + 
							movie.getRating() + " " + 
							movie.getYear()); 

		// Uses Comparable to sort by year 
		System.out.println("============================================");
		System.out.println("\nSorted by year"); 
		System.out.println("============================================");
		Collections.sort(list); 
		for (Movie movie: list) 
			System.out.println(movie.getYear() + " " + 
							movie.getRating() + " " + 
							movie.getName()+" "); 
	}
}
