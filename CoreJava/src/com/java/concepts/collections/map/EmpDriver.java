package com.java.concepts.collections.map;

import java.util.HashMap;
import java.util.Map;

public class EmpDriver {

	public static void main(String[] args) {

		 Map<Integer, Employee> employeesMap = new HashMap<>();

	        employeesMap.put(1001, new Employee(1001, "Rajeev", "Bengaluru", 001));
	        employeesMap.put(1002, new Employee(1002, "David", "New York", 002));
	        employeesMap.put(1003, new Employee(1003, "Jack", "Paris", 003));
	        
//	        repeat
	        employeesMap.put(1001, new Employee(1001, "Rajeev", "Bengaluru", 001));
	        employeesMap.put(1002, new Employee(1002, "David", "New York", 002));
	        employeesMap.put(1003, new Employee(1003, "Jack", "Paris", 003));

	        System.out.println(employeesMap);
	        System.out.println(employeesMap.size());
	}

}
