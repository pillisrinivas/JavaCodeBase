package com.java.concepts.apache.commons;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.HashedMap;

public class BiDiDriver {
	public static void main(String[] args) {
		BidiMap<CustomerT,SavingsAccount> hs1 = CustomerT.treeMapCustomerAccount();
		System.out.println(hs1);
		System.out.println(hs1.size());
		System.out.println("Key is: " + hs1.getKey(new SavingsAccount("2910813709")).toString());
		hs1.removeValue(new SavingsAccount("2910813709"));
		System.out.println(hs1);
		System.out.println(hs1.size());
//		Map<CustomerT, ? extends Accounts> map = hs1;
//		BidiMap<CustomerT, ? extends Accounts> bidi = new TreeBidiMap<CustomerT, SavingsAccount>();
	}
}
