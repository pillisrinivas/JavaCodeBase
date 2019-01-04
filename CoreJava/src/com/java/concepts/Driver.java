package com.java.concepts;

import java.util.Arrays;
import java.util.List;

public class Driver {

	static Arrays str;
	static Arrays arr;

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
		List<String> str4;

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
		System.out.println(cu);
//		System.out.println("Sorted Customer object: " + Arrays.parallelSort(cu));
		
		String[] v3 = new String[3];
		v3[0] = "How are you";
		v3[1] = "What?";

		int val = 20;
		Integer i = 99;

		int x = i.intValue();
		System.out.println("Value of integer x: " + x);

	}

}
