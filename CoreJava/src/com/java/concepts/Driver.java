package com.java.concepts;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Driver1!");
		System.out.println("What's up?");
		
		Driver drv = new Driver();
		String d = drv.toString();
		System.out.println("Value of toString: " + d);
		Object obj = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		
		Object obj1 = new Driver();
		System.out.println(obj1.getClass());
		ClassLoader loader;
		
	
	}
}
