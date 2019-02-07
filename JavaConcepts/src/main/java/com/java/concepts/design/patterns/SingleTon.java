package com.java.concepts.design.patterns;

// SingleTon design pattern

public class SingleTon {
	public static void main(String[] args) {
//		SingleTonCustomer custRef = SingleTonCustomer.getCustomerInstance();
//		SingleTonCustomer custRef1 = SingleTonCustomer.getCustomerInstance();
		SingleTonCustomer custRef = SingleTonCustomer.getInstance();
		SingleTonCustomer custRef1 = SingleTonCustomer.getInstance();
//		
	}
}


