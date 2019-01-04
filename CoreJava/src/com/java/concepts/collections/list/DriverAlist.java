package com.java.concepts.collections.list;

import java.util.ArrayList;

import com.java.concepts.generics.Customer;

public class DriverAlist extends Customer {

	public DriverAlist() {
		super("Default");
		// TODO Auto-generated constructor stub
	}

	public Object createCustomer() {
		Customer cust = new Customer("2910813709", (byte) 35, 20333650);
		return cust;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
//		al.add("pencil");
//		al.add("ink");
//		al.add("notebook");
		al.add(null);

		System.out.println("ArrayList contains the string 'ink pen': " + al.contains("ink pen"));
		System.out.println("ArrayList contains the string 'pen': " + al.contains("pen"));
		System.out.println("ArrayList contains the string 'pencil': " + al.contains("pencil"));
		System.out.println("ArrayList contains the string 'book': " + al.contains("book"));
		System.out.println("ArrayList contains the string 'null': " + al.contains(null));

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(1);
		al2.add(99);
		al2.add(56);
		al2.add(13);
		al2.add(44);
		al2.add(6);
		System.out.println("al2 :" + al2);
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.addAll(al2);
		System.out.println("al3: copy of al2" + al3);
		al3.addAll(al2);
		System.out.println("al3 + al2:" + al3);
		
		

		System.out.println("'1' is present in arraylist: " + al2.contains(1));
		System.out.println("'55' is present in arraylist: " + al2.contains(55));
		System.out.println("'44' is there in arraylist: " + al2.contains(44));
		System.out.println("'7' is there in arraylist: " + al2.contains(7));

		DriverAlist Alist = new DriverAlist();
		String str = Alist.getKnid();
		System.out.println("Knid value: " + str);
		System.out.println("toString value: " + Alist.toString());
		Customer cust = (Customer) Alist.createCustomer();
		Customer cust1 = (Customer) Alist.createCustomer();
		System.out.println("Knid value: " + cust.getKnid());
		System.out.println(cust.equals(cust1));
//	      System.out.println("toString value: " + cust.toString());
	}

}
