package com.java.concepts.apache.commons;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.map.HashedMap;

public class AccountDriver  {
	public static void main(String[] args) {
		HashMap<Customer, Set<Accounts>> hs1 = Customer.mapCustomerAccount();
		System.out.println(hs1);
		IterableMap<Customer, Set<Accounts>> imap = new HashedMap<>(hs1);
		MapIterator<Customer, Set<Accounts>> ip = imap.mapIterator();
		while(ip.hasNext() ) {
			System.out.println("Key: Customer" + ip.next());
			System.out.println("Value: Collection of accounts: " + ip.getValue());
			if (ip.next().getKnid().equals("2910813709")) {
				System.out.println("Inside");
				Accounts ac1 = new SavingsAccount("2910813709");
				SavingsAccount sa = (SavingsAccount) ac1;
				sa.setAccountId("Srini02");
				Set<Accounts> sa1 = new HashSet<Accounts>();
				sa1.add(sa);
				System.out.println(sa1);
				ip.setValue(sa1);
//				(SavingsAccount)ac1
			}
		}
		
		ip = imap.mapIterator();
		while(ip.hasNext() ) {
			System.out.println("Key: Customer" + ip.next());
			System.out.println("Value: Collection of accounts: " + ip.getValue());
		}
	}
}
