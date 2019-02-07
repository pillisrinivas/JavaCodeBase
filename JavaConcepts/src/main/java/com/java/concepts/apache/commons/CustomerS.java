package com.java.concepts.apache.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

import org.apache.commons.collections4.BidiMap;

public class CustomerS {
	private String knid; // unique for a given customer
	private String name;
	private int age;
	private String city;
	private String customerType;
	private String custGroup;

	public CustomerS() {
		super();
	}

	public String getKnid() {
		return knid;
	}

	public String getCustGroup() {
		return custGroup;
	}

	public CustomerS(String knid, String name, int age, String city, String customerType) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((knid == null) ? 0 : knid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CustomerS))
			return false;
		CustomerS other = (CustomerS) obj;
		if (knid == null) {
			if (other.knid != null)
				return false;
		} else if (!knid.equals(other.knid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [knid=" + knid + ", name=" + name + ", age=" + age + ", city=" + city + ", customerType="
				+ customerType + "]";
	}

	public CustomerS(String knid, String name, int age, String city) {
		this.knid = knid;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	

	public static HashMap<CustomerS, Accounts> hashMapCustomerAccount() {
		CustomerS cu1 = new CustomerS("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerS cu2 = new CustomerS("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerS cu3 = new CustomerS("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerS cu4 = new CustomerS("6757483949", "John", 45, "Malmo", "G4");

		CustomerS cu5 = new CustomerS("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerS cu6 = new CustomerS("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerS cu7 = new CustomerS("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerS cu8 = new CustomerS("6757483949", "John", 45, "Malmo", "G4");
		
		Collection<CustomerS> custref = new ArrayList<CustomerS>();
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
		
		Accounts ac1 = new SavingsAccount(cu1);
		Accounts ac2 = new SavingsAccount(cu2);
		Accounts ac3 = new SavingsAccount(cu3);
		Accounts ac4 = new SavingsAccount(cu4);
		
		Collection<Accounts> accref = new ArrayList<Accounts>();
		accref.add(ac1);
		accref.add(ac2);
		accref.add(ac3);
		accref.add(ac4);

		printInfo(accref);
		
		HashMap<CustomerS, Accounts> cusref = new HashMap<CustomerS, Accounts>();
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

	public static TreeMap<CustomerS, Accounts> treeMapCustomerAccount() {
		CustomerS cu1 = new CustomerS("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerS cu2 = new CustomerS("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerS cu3 = new CustomerS("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerS cu4 = new CustomerS("6757483949", "John", 45, "Malmo", "G4");
		
		CustomerS cu5 = new CustomerS("2910813709", "Srinivas", 35, "Hyderabad","G1");
		CustomerS cu6 = new CustomerS("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		CustomerS cu7 = new CustomerS("4738459956", "Jens", 52, "Copenhagen", "G3");
		CustomerS cu8 = new CustomerS("6757483949", "John", 45, "Malmo", "G4");
		
		Collection<CustomerS> custref = new ArrayList<CustomerS>();
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
		
		Accounts ac1 = new SavingsAccount(cu1);
		Accounts ac2 = new SavingsAccount(cu2);
		Accounts ac3 = new SavingsAccount(cu3);
		Accounts ac4 = new SavingsAccount(cu4);
		
		Collection<Accounts> accref = new ArrayList<Accounts>();
		accref.add(ac1);
		accref.add(ac2);
		accref.add(ac3);
		accref.add(ac4);
		
		printInfo(accref);
		
		TreeMap<CustomerS, Accounts> cusref = new TreeMap<CustomerS, Accounts>();
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

	public static <T> void printInfo(Collection<T> custref) {
			System.out.println("Size of Collection: " + custref.size());
	}
}
