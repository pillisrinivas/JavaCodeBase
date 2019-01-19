package com.java.concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Driver {

	static Arrays str;
	static Arrays arr;

	public static <E> void swap(List<E> a, int i, int j) {
	    E tmp = a.get(i);
	    a.set(i, a.get(j));
	    a.set(j, tmp);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there !");
		System.out.println("What's up?");

		String[] v = new String[2];
		v[0] = "hello";
		v[1] = "Hi";
		
		int[] a = {13, 7, 6, 45, 21, 9, 101, 102};
		
		Arrays.sort(v);
		System.out.println("Print of array v" + Arrays.toString(v));
		
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 

		Arrays.sort(arr); 
		System.out.println("Print of array arr"  + Arrays.toString(arr));
		
		List<Object> str1;
		ArrayList<String> str4 = new ArrayList<String>();
		str4.add("srini");
		str4.add("ball");
		str4.add("Siri");
		
		System.out.println("str4: " + str4);
		List<String> str5 = (List<String>) str4.clone();
		System.out.println("clone of str4: str5" + str5);
		str5.add("Sunny");
		str5.add("Khanna");
		System.out.println("str4: " + str4);
		System.out.println("str5: " + str5);
		

		
		str1 = Arrays.asList(v);
		System.out.println("Value of str1(v): " + str1);
		System.out.println("Value of str1(v): " + str1.getClass().getName());
		for (Object obj : str1) {
			System.out.println("Individual Value of str1(v): " + obj);
		}
		
		Object[] v2 = new Object[3];
		v2[0] = "How are you";
		v2[1] = Integer.valueOf(99);
		v2[2] = Byte.valueOf((byte) 10);
		v2[1] = Integer.valueOf(55);
		str1 = str.asList(v2);
		System.out.println("Value of str1(v2): " + str1);
		System.out.println("Value of str1(v2): " + str1.getClass().getName());
		for (Object obj : str1) {
			System.out.println("Individual Value of str1(v2): " + obj);
			System.out.println("Individual Value of str1(v2): " + obj.getClass());
		}
		
		Customer c1 = new Customer("Srini");
		Customer c2 = new Customer("Siri");
		Customer c3 = new Customer("Khanna");
		
		
		Customer[] cu = new Customer[3];
		cu[2] = new Customer("Kiran");
		cu[1] = c2;
		cu[0] = c1;
		
		for (Customer co: cu) {
			System.out.println("Customer array: " + co.toString());
		}
		
		Arrays.sort(cu);
		
		for (Customer co: cu) {
			System.out.println("Sorted Customer array: " + co.toString());
		}
		
		System.out.println("===================================================");
		List<Customer> cref = Arrays.asList(cu);
		//ArrayList<Customer> jin = (ArrayList<Customer>)cref;
		System.out.println("cref: " + cref);
		ArrayList<Customer> acu = new ArrayList<Customer>(cref);
//		for (Customer co: cref) {
//			acu.add(new Customer(co.getName()));
//		}
		//acu.addAll(cref);
		System.out.println("acu copy of cref:" + acu);
//		System.out.println("Sorted Customer object: " + Arrays.parallelSort(cu));
		System.out.println("===================================================");
		Collections.sort(cref, Collections.reverseOrder());
		System.out.println("cref: reverse order " + cref);
		
		ArrayList<Customer> jin = acu;
		ArrayList<Customer> cin = (ArrayList<Customer>)jin.clone();
		System.out.println("Array List: jin: " + jin);
		System.out.println("Array List: cin(clone of jin): " + cin);
		cin.add(new Customer("Tom"));
		for (Customer co: cin) {
			if (co.getName().equals("Siri")) {
				co.setName("Bundi");
			}
		}
		System.out.println("Set operation===============================");
		cin.set(0, new Customer("Bondu"));
		System.out.println("Array List: jin: " + jin);
		System.out.println("Array List: cin(clone of jin): " + cin);
		
		Collection<Customer> lcust1 = acu;
		int size = cin.size();
		Customer[] obj9 =  cin.toArray(new Customer[0]);
		Customer[] cu9 = new Customer[size];
		cu9 = cin.toArray(cu9);
		System.out.println("Class of cin" + cin.getClass().getName());
		System.out.println("Class of obj9" + obj9.getClass().getName());
		System.out.println("Class of cref" + cref.getClass().getName());
		System.out.println("Class of lcust1" + lcust1.getClass().getName());
		
		for (Customer co: obj9) {
			System.out.println("List to Array: obj9" + co.getName());
		}
		
	

		String[] v3 = new String[3];
		v3[0] = "How are you";
		v3[1] = "What?";

		int val = 20;
		Integer i = 99;
		
		ListIterator<String> ir;
		
		int x = i.intValue();
		System.out.println("Value of integer x: " + x);
//		========================================================================
		cin.add(new Customer("Srini"));
		System.out.println("Array List: cin: before swap: " + cin);
		int k = Collections.frequency(cin, new Customer("Srini"));
		System.out.println("Frequency of object " + k );
		List<String> vb = new ArrayList<String>();
		vb.add("Hello");
		vb.add("Bye");
		swap(cin, 1, 0);
		swap(cin, 0, 1);
		System.out.println("Array List: cin: after swap: " + cin);
		
		
		
//		==========================================================================
		

	}

}
