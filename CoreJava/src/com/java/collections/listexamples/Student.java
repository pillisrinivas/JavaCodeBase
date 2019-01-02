package com.java.collections.listexamples;

import java.util.ArrayList;
import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stu = new ArrayList<String>();
		stu.add("one");
		stu.add("two");
		stu.add("three");
		
		System.out.println(stu);
		
		for(String str: stu)
			System.out.println("Print :" + str);
	}

}
