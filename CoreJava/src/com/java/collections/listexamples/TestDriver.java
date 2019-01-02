package com.java.collections.listexamples;

import java.util.*;

public class TestDriver {

	public static void printList(List<Object> list) {
		for (Object elem : list)
			System.out.println(elem + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good night");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Howdy");
		al2.add("Good Evening");
		al2.add("bye");
		al2.add("Good night");

		// Storing the comparison output in ArrayList<String>
		ArrayList<String> al3 = new ArrayList<String>();
		for (String temp : al1)
			al3.add(al2.contains(temp) ? "Yes" : "No");
		System.out.println(al3);

		// Storing the comparison output in ArrayList<Integer>
		ArrayList<Integer> al4 = new ArrayList<Integer>();
		for (String temp2 : al1)
			al4.add(al2.contains(temp2) ? 1 : 0);
		System.out.println(al4);

		List li = al1;
		li.add("Srini");
		System.out.println(li);
		System.out.println(al1);

		List<String> li1 = new ArrayList<>();
		li1.add("Good Evening");
		li1.add("bye");
		li1.add("Good night");
		
		Iterator<String> i = li1.iterator();
		while (i.hasNext()) {
			String temp = i.next();
			System.out.println("temp value: " + temp);
			if (temp.equals("bye")) {
				i.remove();
			}

		}

		System.out.println("Value of i.hasNext: " + i.hasNext());

		i = al2.iterator();

//		al2.containsAll(c)
		while (i.hasNext()) {
			String temp = i.next();
			System.out.println("temp value after changes: " + temp);
		}
		
		Collection<?> c = new ArrayList<String>();
		
		
//		  for(String temp1 : li1) li1.add(al2.contains(temp1) ? "Yes" : "No");
//		  System.out.println(li1);

//		printList(al1);

	}
}
