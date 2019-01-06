package com.java.concepts.collections.set;

import java.util.Comparator;

public class CustomerSort {

}

class NameSort extends CustomerSort implements Comparator<CustomerSortType> {

	@Override
	public int compare(CustomerSortType o1, CustomerSortType o2) {
		System.out.println("In NameSort Compare Method");
		if ((o1 instanceof CustomerTree) && (o2 instanceof CustomerTree)) {
//			System.out.println("CustomerTree object");
			CustomerTree cust1 = (CustomerTree) o1;
			CustomerTree cust2 = (CustomerTree) o2;
			return cust1.getName().compareTo(cust2.getName());
		} else if ((o1 instanceof Customer) && (o2 instanceof Customer)) {
//			System.out.println("Customer object");
			Customer cust1 = (Customer) o1;
			Customer cust2 = (Customer) o2;
			return cust1.getName().compareTo(cust2.getName());
		} else
		return 0;
	}

}

class KnidSort extends CustomerSort implements Comparator<CustomerSortType> {

	@Override
	public int compare(CustomerSortType o1, CustomerSortType o2) {
		if ((o1 instanceof CustomerTree) && (o2 instanceof CustomerTree)) {
//			System.out.println("CustomerTree object");
			CustomerTree cust1 = (CustomerTree) o1;
			CustomerTree cust2 = (CustomerTree) o2;
			return cust1.getKnid().compareTo(cust2.getKnid());
		} else if ((o1 instanceof Customer) && (o2 instanceof Customer)) {
//			System.out.println("Customer object");
			Customer cust1 = (Customer) o1;
			Customer cust2 = (Customer) o2;
			return cust1.getKnid().compareTo(cust2.getKnid());
		} else
		return 0;
	}

}

class AgeSort implements Comparator<CustomerSortType> {

	@Override
	public int compare(CustomerSortType o1, CustomerSortType o2) {
		if ((o1 instanceof CustomerTree) && (o2 instanceof CustomerTree)) {
//			System.out.println("CustomerTree object");
			CustomerTree cust1 = (CustomerTree) o1;
			CustomerTree cust2 = (CustomerTree) o2;
			return cust1.getAge() > cust2.getAge() ? 1: cust1.getAge() < cust2.getAge() ? -1:0;
		} else if ((o1 instanceof Customer) && (o2 instanceof Customer)) {
//			System.out.println("Customer object");
			Customer cust1 = (Customer) o1;
			Customer cust2 = (Customer) o2;
			return cust1.getAge() > cust2.getAge() ? 1: cust1.getAge() < cust2.getAge() ? -1:0;
		} else
		return 0;
	}
	
}