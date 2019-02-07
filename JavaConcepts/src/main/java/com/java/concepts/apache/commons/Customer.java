package com.java.concepts.apache.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Customer {
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

	public Customer(String knid, String name, int age, String city, String customerType) {
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
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
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

	public Customer(String knid, String name, int age, String city) {
		this.knid = knid;
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public Customer() {
	}
	
	public static Collection<Customer> customerList() {
		Customer cu1 = new Customer("2910813709", "Srinivas", 35, "Hyderabad","G1");
		Customer cu2 = new Customer("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		Customer cu3 = new Customer("4738459956", "Jens", 52, "Copenhagen", "G3");
		Customer cu4 = new Customer("6757483949", "John", 45, "Malmo", "G4");

		Collection<Customer> custref = new ArrayList<Customer>();
		custref.add(cu3);
		custref.add(cu4);
		custref.add(cu1);
		custref.add(cu2);
		return custref;
	}

	public static HashMap<Customer, Set<Accounts>> mapCustomerAccount() {
		Customer cu1 = new Customer("2910813709", "Srinivas", 35, "Hyderabad","G1");
		Customer cu2 = new Customer("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		Customer cu3 = new Customer("4738459956", "Jens", 52, "Copenhagen", "G3");
		Customer cu4 = new Customer("6757483949", "John", 45, "Malmo", "G4");
		
		Collection<Customer> custref = new ArrayList<Customer>();
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
		//System.out.println("Size of Accounts Collection: " + accref.size());
		
		HashMap<Customer, Set<Accounts>> custAcc = new HashMap<Customer, Set<Accounts>>();
//		LinkedHashMap<Customer, Set<Accounts>> custAcc = new LinkedHashMap<Customer, Set<Accounts>>();
//		TreeMap<Customer, Set<Accounts>> custAcc = new TreeMap<Customer, Set<Accounts>>();
		for(Customer co: custref) {
			Set<Accounts> sa1 = new HashSet<Accounts>();
//			System.out.println("Customer id: " + co.getKnid() + "Counter: " + i);
			for (Accounts ao: accref) {
				if (ao != null && ao instanceof SavingsAccount ) {
					SavingsAccount sa = (SavingsAccount) ao;
					if (co.getKnid().equals(sa.getKnid())) {
						sa1.add(ao);
//						System.out.println("Before Adding to Map: " + co.getKnid());
						custAcc.put(co, sa1);
//						System.out.println("Linking Customer with Account: " + custAcc);
					}
				}
			}
		}
		
		
		for (Customer co: custAcc.keySet()) {
			System.out.println("Value of Key: " + co.getKnid() + " is " + custAcc.get(co) + "Name is " + co.getName() +  " Age is: " + co.getAge());
		}
		
		
//		Set<Map.Entry<Customer, Set<Accounts>>> cnum =  custAcc.entrySet();
//		for (Map.Entry<Customer, Set<Accounts>> ref: cnum) {
//			System.out.println("Customer key" + ref.getKey() + "Account values: " + ref.getValue() );
//		}
		
		System.out.println("HashMap reference: " + custAcc);
		System.out.println("Size of HashMap: " + custAcc.size());
		
//		Accounts acc = new SavingsAccount("2910813709");
		HashMap<Customer, Accounts> cusref = new HashMap<Customer, Accounts>();
		cusref.put(cu1, ac1);
		cusref.put(cu2, ac2);
		cusref.put(cu3, ac3);
		cusref.put(cu4, ac4);
		
		System.out.println("Another customer account mapping: " + cusref);
		return custAcc;
	}

	public static <T> void printInfo(Collection<T> custref) {
			System.out.println("Size of Collection: " + custref.size() + " Class: " + (custref.toString()) );
	}
}
