package com.java.concepts.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class RandomTreeSet {

	public static void main(String[] args) {

		TreeSet<CustomerTree> hs9 = new TreeSet<CustomerTree>();
		hs9.add(new CustomerTree("6910813709", "Vurtr", 15));
		hs9.add(new CustomerTree("8910813709", "Jens", 10));

		System.out.println("Size is: " + hs9.size());
		System.out.println(hs9);

		TreeSet<CustomerTree> hs8 = new TreeSet<CustomerTree>(new AgeSort());
		hs8.add(new CustomerTree("2910813709", "Xrini", 35));
		hs8.add(new CustomerTree("2701890011", "Biri", 28));
		hs8.add(new CustomerTree("0112190012", "Fhitti", 1));
		hs8.add(new CustomerTree("3742345642", "Stubby", 3));
		hs8.add(new CustomerTree("3742344564"));

//		System.out.println(hs8);
		Iterator<CustomerTree> lc7 = hs8.iterator();
		System.out.println("==============================================");
		System.out.println("TreeSet hs8: with no duplicates and name sort ");
		System.out.println("Size of the TreeSet collection: " + hs8.size());

		while (lc7.hasNext()) {
			System.out.println("Tree set Object: " + lc7.next().toString());

		}
		
		Collection<CustomerTree> s1 = new ArrayList<CustomerTree>();
		s1.add(new CustomerTree("2910813709", "Srini", 35));
		s1.add(new CustomerTree("2701890011", "Siri", 28));
		s1.add(new CustomerTree("0112190012", "chitti thalli", 1));
		s1.add(new CustomerTree("3742345642", "Stubby", 3));
		s1.add(new CustomerTree("3742344564"));

//		Repeat the same elements
		s1.add(new CustomerTree("2910813709", "Srini", 35));
		s1.add(new CustomerTree("2701890011", "Siri", 28));
		s1.add(new CustomerTree("0112190012", "chitti thalli", 1));
		s1.add(new CustomerTree("3742345642", "Stubby", 3));
		System.out.println("Collection of ArrayList CustomerTree objects: with duplicates ");
		System.out.println("==============================================");
		System.out.println("Size of the collection: " + s1.size());
		for (CustomerTree obj: s1) {
			System.out.println("Collection of CustomerTree object: " + obj.toString());
		}
		
		TreeSet<CustomerTree> hs0 = new TreeSet<CustomerTree>(s1);
		Iterator<CustomerTree> lc3 = hs0.iterator();
		System.out.println("==============================================");
		System.out.println("TreeSet hs0: with no duplicates and name sort ");
		System.out.println("Size of the TreeSet collection: " + hs0.size());

		while (lc3.hasNext()) {
			System.out.println("Tree set Object: " + lc3.next().toString());

		}
	}
}
