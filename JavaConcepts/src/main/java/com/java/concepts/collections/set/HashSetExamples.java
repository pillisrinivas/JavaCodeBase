package com.java.concepts.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {

	public static void main(String[] args) {
		 String elements[] = { "A", "B", "C", "D", "E" };
		    Set<String> set = new HashSet<String>(Arrays.asList(elements));

		    elements = new String[] { "A", "B", "C", "F"};
		    Set<String> set2 = new HashSet<String>(Arrays.asList(elements));

		    System.out.println(set.containsAll(set2));
		    
		    elements = new String[] { "C", "E", "G", "H"};
		    Set<String> set3 = new HashSet<String>(Arrays.asList(elements));
		    
		    Set<String> intersection = new HashSet<String>(set);
		    Set<String> union = new HashSet<String>(set);
		    Set<String> difference = new HashSet<String>(set);
		    
		    System.out.println("Set: " + set);
		    System.out.println("Set3: " + set3);

		    System.out.println(intersection.retainAll(set3));
		    System.out.println("intersection: retainAll  " + intersection);
		    
		    System.out.println(union.addAll(set3));
		    System.out.println("union: addAll " + union);

		    System.out.println(difference.removeAll(set3));
		    System.out.println("difference: removeAll" + difference);
		    
		    Set set4 = (HashSet)((HashSet) set).clone();
		    System.out.println("Clone of set: set4: " + set4);
		    
	}

}
