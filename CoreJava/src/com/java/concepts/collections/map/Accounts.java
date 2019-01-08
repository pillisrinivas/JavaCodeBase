package com.java.concepts.collections.map;

public interface Accounts {
	Accounts getAccountInfo(Object obj);
//	Accounts createAccount();
	String getAccountStatus();
	double getAccountBalance();
	void cashWithDraw();
	void cashDeposit();
}
