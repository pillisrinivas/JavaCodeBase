package com.java.concepts.collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AccountDriver  {

	public static void main(String[] args) {
		
		Customer cu1 = new Customer("2910813709", "Srinivas", 35, "Hyderabad","G1");
		Customer cu2 = new Customer("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		Customer cu3 = new Customer("4738459956", "Jens", 52, "Copenhagen", "G3");
		Customer cu4 = new Customer("6757483949", "John", 45, "Malmo", "G4");
		
		Collection<Customer> custref = new ArrayList<Customer>();
		custref.add(cu3);
		custref.add(cu4);
		custref.add(cu1);
		custref.add(cu2);
//		custref.add(cu3);
//		custref.add(cu4);
		
//   Adding duplicates
		custref.add(cu1);
		custref.add(cu2);
		custref.add(cu3);
		custref.add(cu4);

		Customer cu5 = new Customer("2910813709", "Srinivas", -1, "Hyderabad", "G5");
		Customer cu6 = new Customer("2801896768", "Sirisha", -1, "Hyderabad", "G6");
		Customer cu7 = new Customer("4738459956", "Jens", -1, "Copenhagen", "G7");
		Customer cu8 = new Customer("6757483949", "John", -1, "Malmo", "G8");

	//   Adding duplicates
			custref.add(cu5);
			custref.add(cu6);
			custref.add(cu7);
			custref.add(cu8);

			
		System.out.println("Size of Customer Collection: " + custref.size());
		
//		Accounts ac1 = new SavingsAccount("2910813709");
//		Accounts ac2 = new SavingsAccount("2801896768");
//		Accounts ac3 = new SavingsAccount("4738459956");
//		Accounts ac4 = new SavingsAccount("6757483949");

		Accounts ac1 = new SavingsAccount(cu1);
		Accounts ac2 = new SavingsAccount(cu2);
		Accounts ac3 = new SavingsAccount(cu3);
		Accounts ac4 = new SavingsAccount(cu4);
		
		Collection<Accounts> accref = new ArrayList<Accounts>();
		accref.add(ac1);
		accref.add(ac2);
		accref.add(ac3);
		accref.add(ac4);

//		Adding duplicates
		accref.add(ac1);
		accref.add(ac2);
		accref.add(ac3);
		accref.add(ac4);

		System.out.println("Size of Accounts Collection: " + accref.size());
		
		int i = 0;
		HashMap<Customer, Set<Accounts>> custAcc = new HashMap<Customer, Set<Accounts>>();
//		LinkedHashMap<Customer, Set<Accounts>> custAcc = new LinkedHashMap<Customer, Set<Accounts>>();
//		TreeMap<Customer, Set<Accounts>> custAcc = new TreeMap<Customer, Set<Accounts>>();
		for(Customer co: custref) {
			Set<Accounts> sa1 = new HashSet<Accounts>();
			i+=1;
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
		Accounts acc = new SavingsAccount(cu1);
		acc.getAccountInfo(acc);
		System.out.println("Print: " + acc.toString());
	}

}
