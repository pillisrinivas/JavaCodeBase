package com.java.concepts.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LhsExamples {

	public static void main(String[] args) {
		Collection<Customer> s1 = new ArrayList<Customer>();
		s1.add(new Customer("2910813709", "Srini", 35));
		s1.add(new Customer("2701890011", "Siri", 28));
		s1.add(new Customer("0112190012", "chitti thalli", 1));
		s1.add(new Customer("3742345642", "Stubby", 3));
		s1.add(new Customer("3742344564"));

//		Repeat the same elements
		s1.add(new Customer("2910813709", "Srini", 35));
		s1.add(new Customer("2701890011", "Siri", 28));
		s1.add(new Customer("0112190012", "chitti thalli", 1));
		s1.add(new Customer("3742345642", "Stubby", 3));
		System.out.println("Collection of ArrayList customer objects: with duplicates ");
		System.out.println("==============================================");
		System.out.println("Size of the collection: " + s1.size());
		for (Customer obj : s1) {
			System.out.println("Collection of Customer object: " + obj.toString());
		}

//		Adding collection of customer objects containing duplicates to LinkedHashSet
		System.out.println("==============================================");
		System.out.println("Adding Collection of Customer object to LinkedHashSet: ");
		LinkedHashSet<Customer> hs1 = new LinkedHashSet<Customer>(s1);

		Iterator<Customer> lc = hs1.iterator();
		System.out.println("==============================================");
		System.out.println("LinkedHashSet hs1: with no duplicates ");
		System.out.println("Size of the LinkedHashSet collection: " + hs1.size());
		while (lc.hasNext()) {
			System.out.println("Hash set Object: " + lc.next().toString());
		}

		System.out.println("==============================================");
		System.out.println("Adding one LinkedHashSet to another LinkedHashSet: ");
		LinkedHashSet<Customer> hs2 = new LinkedHashSet<Customer>(hs1);

//		Repeat the same elements
//		hs2.add(new Customer("2910813709", "Srini", 35));
//		hs2.add(new Customer("2701890011", "Siri", 28));
//		hs2.add(new Customer("0112190012", "chitti thalli", 1));
//		hs2.add(new Customer("3742345642", "Stubby", 3));

		System.out.println("==============================================");
		System.out.println("LinkedHashSet hs2: ");
		Iterator<Customer> lc1 = hs2.iterator();
		while (lc1.hasNext()) {
			System.out.println("Hash set Object: " + lc1.next().toString());
		}
	}

}
