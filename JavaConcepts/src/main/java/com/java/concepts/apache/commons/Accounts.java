package com.java.concepts.apache.commons;

public interface Accounts {
	Accounts getAccountInfo(Object obj);
//	Accounts createAccount();
	String getAccountStatus();
	double getAccountBalance();
	void cashWithDraw();
	void cashDeposit();
//	int compareTo(SavingsAccount o);
}
