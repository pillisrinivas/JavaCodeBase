package com.java.concepts.apache.commons.beanutils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

import com.java.concepts.apache.commons.Customer;

public class Driver {

	public static void main(String[] args) {
		Customer cu1 = new Customer("2910813709", "Srinivas", 35, "Hyderabad","G1");
		Customer cu5 = new Customer("2910813709", "Srinivas1", 36, "Hyderabad","G3");
		Customer cu2 = new Customer("2801896768", "Sirisha", 25, "Hyderabad", "G2");
		Customer cu3 = new Customer("4738459956", "Jens", 52, "Copenhagen", "G3");
		Customer cu4 = new Customer("6757483949", "John", 45, "Malmo", "G4");
		List<Customer> licu = new ArrayList<>();
		licu.add(cu1);
		licu.add(cu2);
		licu.add(cu3);
		licu.add(cu4);
		licu.add(cu5);
		EqualPredicate nameEqlPredicate = new EqualPredicate("2910813709");
		BeanPredicate beanPredicate = new BeanPredicate("knid" , nameEqlPredicate);
		System.out.println(CollectionUtils.find(licu, beanPredicate));
		System.out.println(CollectionUtils.select(licu, beanPredicate).size());
	}

}
