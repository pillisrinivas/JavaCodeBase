package com.java.concepts.collections.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDriver {

	public static void main(String[] args) {
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
		
//		Adding collection of CustomerTree objects containing duplicates to TreeSet
		System.out.println("==============================================");
		System.out.println("Adding Collection of CustomerTree object to TreeSet: ");
		TreeSet<CustomerTree> hs1 = new TreeSet<CustomerTree>(s1);
		hs1.add(new CustomerTree("2910813709", "Srini", 35));
		hs1.add(new CustomerTree("2701890011", "Siri", 28));
		
		Iterator<CustomerTree> lc = hs1.iterator();
		System.out.println("==============================================");
		System.out.println("TreeSet hs1: with no duplicates ");
		System.out.println("Size of the TreeSet collection: " + hs1.size());
		while(lc.hasNext()) {
			System.out.println("Hash set Object: " + lc.next().toString());
		}
		
	
		TreeSet<CustomerTree> hs8 = new TreeSet<CustomerTree>(new NameSort());
		hs8.add(new CustomerTree("2910813709", "Srini", 35));
		hs8.add(new CustomerTree("2701890011", "Siri", 28));
		hs8.add(new CustomerTree("0112190012", "chitti thalli", 1));
		hs8.add(new CustomerTree("3742345642", "Stubby", 3));
		hs8.add(new CustomerTree("3742344564"));
		
		Iterator<CustomerTree> lc7 = hs8.iterator();
		System.out.println("==============================================");
		System.out.println("TreeSet hs8: with no duplicates and name sort ");
		System.out.println("Size of the TreeSet collection: " + hs8.size());
		while(lc7.hasNext()) {
			System.out.println("Tree set Object: " + lc7.next().toString());
		}
		
		System.out.println("==============================================");
		System.out.println("Adding one TreeSet to another TreeSet: ");
		TreeSet<CustomerTree> hs2 = new TreeSet<CustomerTree>(hs1);

//		Repeat the same elements
//		hs2.add(new CustomerTree("2910813709", "Srini", 35));
//		hs2.add(new CustomerTree("2701890011", "Siri", 28));
//		hs2.add(new CustomerTree("0112190012", "chitti thalli", 1));
//		hs2.add(new CustomerTree("3742345642", "Stubby", 3));
		
		System.out.println("==============================================");
		System.out.println("TreeSet hs2: ");	
		Iterator<CustomerTree> lc1 = hs2.iterator();
		while(lc1.hasNext()) {
			System.out.println("Hash set Object: " + lc1.next().toString());
		}
		
		List<CustomerTree> al = new ArrayList<CustomerTree>(hs2);
		al.add(new CustomerTree("2910813709", "Srini", 35));
		al.add(new CustomerTree("2701890011", "Siri", 28));
		al.add(new CustomerTree("0112190012", "chitti thalli", 1));
		al.add(new CustomerTree("3742345642", "Stubby", 3));
		
		Iterator<CustomerTree> lc2 = al.iterator();
		System.out.println("==============================================");
		System.out.println("ArrayList al: ");	
		while(lc2.hasNext()) {
			System.out.println("ArrayList Object: " + lc2.next().toString());
		}
		
//		TreeSet to Array of CustomerTree object
//		CustomerTree[] co = hs1.toArray(new CustomerTree[0]);
//		Another way
		CustomerTree[] co = new CustomerTree[hs1.size()];
		hs1.toArray(co);
		System.out.println("==============================================");
		for (CustomerTree cu: co) {
			System.out.println("Array of CustomerTree Object: " + cu);
		}
	}

}
