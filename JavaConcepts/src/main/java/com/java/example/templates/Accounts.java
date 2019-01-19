package com.java.example.templates;

public interface Accounts {
	Accounts getAccountInfo(Object obj);
//	Accounts createAccount();
	String getAccountStatus();
	int getAccountBalance();
	void cashWithDraw();
	void cashDeposit();
}
