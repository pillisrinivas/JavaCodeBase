package com.java.concepts.apache.commons;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.Predicate;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.functors.EqualPredicate;

public class CollectionUtilsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Customer> cref = Customer.customerList();
		List<Customer> lref = (List<Customer>)Customer.customerList();
		System.out.println(lref);
		System.out.println("Collection size: Before: " + cref.size());
		lref.add(new Customer("34215643467", "Tru", 39, "Arhus"));
		CollectionUtils.addAll(cref, lref);
		System.out.println("Collection size: Before: " + cref.size());
//		
		for(Customer cu: cref) {
			System.out.println(cu.getKnid());
		}
	}

}

