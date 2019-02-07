package com.java.concepts.apache.commons;

import java.util.HashMap;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

public class HashedMapDriver {
	public static void main(String[] args) {
		HashMap<CustomerS, Accounts> hs1 = CustomerS.hashMapCustomerAccount();
		CustomerS cu = new CustomerS("2910813709", "Srini", 37, "Bangalore", "G1");
		System.out.println(hs1.containsKey(cu));
//		hs1.remove(cu);
		System.out.println(hs1.get(cu));
		System.out.println(hs1.size());
		
//		HashedMap from apache commons
		IterableMap<CustomerS, Accounts> imap = new HashedMap<>(hs1);
		MapIterator<CustomerS, Accounts> ip = imap.mapIterator();
		while (ip.hasNext()) {
			System.out.println("Key: Customer1" + ip.next());
			System.out.println("Value: Collection of accounts: " + ip.getValue());
		}
	}
}
