package com.java.concepts.apache.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class CustomerT implements Comparable<CustomerT>{
	private String knid; // unique for a given customer
	private String name;
	private int age;
	private String city;
	private String customerType;
	private String custGroup;

	public String getKnid() {
		return knid;
	}

	public String getCustGroup() {
		return custGroup;
	}

	public CustomerT(String knid, String name, int age, String city, String customerType) {
		super();
		this.knid = knid;
		this.name = name;
		this.age = age;
		this.city = city;
		this.customerType = customerType;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public void setKnid(String knid) {
		this.knid = knid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public CustomerT(String knid, String name, int age, String city) {
		this.knid = knid;
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public int compareTo(CustomerT o) {
		return this.getKnid().compareTo(o.getKnid());
	}
	
	public static BidiMap<CustomerT, SavingsAccount> treeMapCustomerAccount() {
		CustomerT cu1 = new CustomerT("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerT cu2 = new CustomerT("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerT cu3 = new CustomerT("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerT cu4 = new CustomerT("6757483949", "John", 45, "Malmo", "G4");
		
		CustomerT cu5 = new CustomerT("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerT cu6 = new CustomerT("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerT cu7 = new CustomerT("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerT cu8 = new CustomerT("6757483949", "John", 45, "Malmo", "G4");
		
		Collection<CustomerT> custref = new ArrayList<CustomerT>();
		custref.add(cu3);
		custref.add(cu4);
		custref.add(cu1);
		custref.add(cu2);
		
// 		duplicate
		custref.add(cu3);
		custref.add(cu4);
		custref.add(cu1);
		custref.add(cu2);
		
		printInfo(custref);
		
		Accounts acc = new SavingsAccount(cu1);
		acc.getAccountInfo(acc);
		System.out.println("Print: " + acc.toString());
		
		SavingsAccount ac1 = new SavingsAccount(cu1);
		SavingsAccount ac2 = new SavingsAccount(cu2);
		SavingsAccount ac3 = new SavingsAccount(cu3);
		SavingsAccount ac4 = new SavingsAccount(cu4);
		
		Collection<Accounts> accref = new ArrayList<Accounts>();
		accref.add(ac1);
		accref.add(ac2);
		accref.add(ac3);
		accref.add(ac4);
		
		printInfo(accref);
		
//		TreeMap<CustomerT, Accounts> cusref = new TreeMap<CustomerT, Accounts>();
		BidiMap<CustomerT, SavingsAccount> cusref = new TreeBidiMap<CustomerT, SavingsAccount>();
		cusref.put(cu1, ac1);
		cusref.put(cu2, ac2);
		cusref.put(cu3, ac3);
		cusref.put(cu4, ac4);
		
//		duplicate
		cusref.put(cu5, ac1);
		cusref.put(cu6, ac2);
		cusref.put(cu7, ac3);
		cusref.put(cu8, ac4);
		
		System.out.println("Another customer account mapping size: " + cusref.size());
		return cusref;
		//System.out.println("Size of Accounts Collection: " + accref.size());
		
	}
	
	@Override
	public String toString() {
		return "CustomerT [knid=" + knid + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}

	public static <T> void printInfo(Collection<T> custref) {
		System.out.println("Size of Collection: " + custref.size());
}
}
