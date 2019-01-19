package com.java.concepts.collections.comparable;

import java.util.Comparator;


public class MovieSort {

}

//Class to compare Movies by ratings 
class RatingCompare implements Comparator<MovieType>
{ 
	public int compare(MovieType m1, MovieType m2) 
	{ 
		if (m1.getRating() < m2.getRating()) return -1; 
		if (m1.getRating() > m2.getRating()) return 1; 
		else return 0; 
	} 
} 

//Class to compare Movies by name 
class NameCompare implements Comparator<MovieType> 
{ 
	public int compare(MovieType m1, MovieType m2) 
	{ 
		return m1.getName().compareTo(m2.getName()); 
	} 
} 


//Class to compare Movies by year 
class YearCompare implements Comparator<MovieType> 
{ 
	public int compare(MovieType m1, MovieType m2) 
	{ 
		return m1.getYear() - m2.getYear();
	} 
} 