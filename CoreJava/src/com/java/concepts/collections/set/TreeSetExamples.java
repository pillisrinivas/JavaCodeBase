package com.java.concepts.collections.set;

import java.util.*;

public class TreeSetExamples {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
//	    ts.add(null);

		System.out.println(ts);

		List<String> li = new ArrayList<String>(ts);
		li.add(null);

		System.out.println(li);
		if (!li.contains(null)) {
			TreeSet<String> ts1 = new TreeSet<String>(li);
			System.out.println(ts1);
		} else System.out.println("Collection has nulls ! ");
		
	}

}
