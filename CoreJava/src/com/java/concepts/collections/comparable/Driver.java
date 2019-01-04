package com.java.concepts.collections.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver1!");
		System.out.println("What's up?");
		
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
		
		ArrayList<Movies> list = new ArrayList<Movies>(); 
		list.add(new Movies("Force Awakens", 8.3, 2015)); 
		list.add(new Movies("Star Wars", 8.7, 1977)); 
		list.add(new Movies("Empire Strikes Back", 8.8, 1980)); 
		list.add(new Movies("Return of the Jedi", 8.4, 1983)); 

		// Sort by rating : (1) Create an object of ratingCompare 
		//				 (2) Call Collections.sort 
		//				 (3) Print Sorted list 
		System.out.println("============================================");
		System.out.println("Sorted by rating"); 
		System.out.println("============================================");
		RatingCompare ratingCompare = new RatingCompare(); 
		Collections.sort(list, ratingCompare); 
		for (Movies movie: list) 
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
		for (Movies movie: list) 
			System.out.println(movie.getName() + " " + 
							movie.getRating() + " " + 
							movie.getYear()); 

		// Uses Comparable to sort by year 
		System.out.println("============================================");
		System.out.println("\nComparable - Sorted by year"); 
		System.out.println("============================================");
		Collections.sort(list); 
		for (Movies movie: list) 
			System.out.println(movie.getYear() + " " + 
							movie.getRating() + " " + 
							movie.getName()+" "); 
		
		// Uses Comparator to sort by year 
		System.out.println("============================================");
		System.out.println("\nComparator - Sorted by year"); 
		System.out.println("============================================");
		YearCompare yearCompare = new YearCompare();
		Collections.sort(list, yearCompare); 
		for (Movies movie: list) 
			System.out.println(movie.getYear() + " " + 
							movie.getRating() + " " + 
							movie.getName()+" "); 

		
//		===================================================================================
		
		ArrayList<Movies1> list1 = new ArrayList<Movies1>(); 
		list1.add(new Movies1("Force Awakens", 8.3, 2015)); 
		list1.add(new Movies1("Star Wars", 8.7, 1977)); 
		list1.add(new Movies1("Empire Strikes Back", 8.8, 1980)); 
		list1.add(new Movies1("Return of the Jedi", 8.4, 1983)); 
	
		System.out.println("============================================");
		System.out.println("Using MovieType reference"); 
		System.out.println("============================================");
		
		
		// Sort by rating : (1) Create an object of ratingCompare 
				//				 (2) Call Collections.sort 
				//				 (3) Print Sorted list 
				System.out.println("============================================");
				System.out.println("Sorted by rating"); 
				System.out.println("============================================");
				RatingCompare ratingCompare1 = new RatingCompare(); 
				Collections.sort(list1, ratingCompare1); 
				for (Movies1 movie: list1) 
					System.out.println(movie.getRating() + " " + 
									movie.getName() + " " + 
									movie.getYear()); 


				// Call overloaded sort method with RatingCompare 
				// (Same three steps as above) 
				System.out.println("============================================");
				System.out.println("\nSorted by name"); 
				System.out.println("============================================");
				NameCompare nameCompare1 = new NameCompare(); 
				Collections.sort(list1, nameCompare1); 
				for (Movies1 movie: list1) 
					System.out.println(movie.getName() + " " + 
									movie.getRating() + " " + 
									movie.getYear()); 
				
				// Uses Comparator to sort by year 
				System.out.println("============================================");
				System.out.println("\nComparator- Sorted by year"); 
				System.out.println("============================================");
				YearCompare yearCompare1 = new YearCompare();
				Collections.sort(list1, yearCompare1); 
				for (Movies1 movie: list1) 
					System.out.println(movie.getYear() + " " + 
									movie.getRating() + " " + 
									movie.getName()+" "); 

	}
}
