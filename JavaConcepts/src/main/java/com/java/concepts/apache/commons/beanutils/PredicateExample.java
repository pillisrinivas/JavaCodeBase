package com.java.concepts.apache.commons.beanutils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.BeanPredicate;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate;

import com.java.concepts.apache.commons.Customer;

public class PredicateExample {
	List<Person> personList = new ArrayList<Person>();

	/**
	 * Basic method which creates the list of person object's
	 *
	 */
	void setUpData() {
		personList.add(new Person("ganesh", "gowtham", 25000));
		personList.add(new Person("britney", "spears", 45000));
		personList.add(new Person("ganesh", "tom", 35000));
		personList.add(new Person("sunny", "dummy", 45000));
	}

	/**
	 * select's the Person object's from collection of person objects based on arg
	 * 
	 * @param propertyName - Person's attribute (firstName (or) lastName (or) salary
	 *                     )
	 * @param value        - Value to be compared to propertyName
	 */
	void selectObjectsByName(String propertyName, String value) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(value);
		BeanPredicate beanPredicate = new BeanPredicate(propertyName, nameEqlPredicate);
		Collection<Person> filteredCollection = CollectionUtils.select(personList, beanPredicate);
		System.out.println("Below are person object(s) whose " + propertyName + " is " + value);
		System.out.println("Matches for entered cr iteria " + CollectionUtils.countMatches(personList, beanPredicate));
		for (Person person : filteredCollection) {
			System.out.println(person);
		}
	}

	/**
	 * select's the person object from collcetion based on propetyName and value
	 * 
	 * @param propertyName - Person's attribute (firstName (or) lastName (or) salary
	 *                     )
	 * @param value        - Value to be compared to propertyName
	 */
	void selectObjectFromCollection(String propertyName, String value) {
		EqualPredicate nameEqlPredicate = new EqualPredicate(value);
		BeanPredicate beanPredicate = new BeanPredicate(propertyName, nameEqlPredicate);
		System.out.println("Below are person object whose " + propertyName + " is " + value);
		System.out.println(CollectionUtils.find(personList, beanPredicate));
	}

	public static void main(String[] args) {
		PredicateExample example = new PredicateExample();
		example.setUpData();
		example.selectObjectsByName("firstName", "ganesh");
		example.selectObjectFromCollection("firstName", "britney");
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
