
package com.java.example.templates;

public class SavingsAccount implements Accounts {
	
	private String knid;
	private String accountId;
	private double balanceAmount;
	private String status;
	private String transId; //Unique transaction id
	private String transType; 
	private double transAmount;
	
	private Customer cust;
	
	
	
	public SavingsAccount(Customer cust) {
		this.cust = cust;
	}

	public SavingsAccount(String knid, String accountId) {
		this.knid = knid;
		this.accountId = accountId;
	}

	public String getKnid() {
		return cust.getKnid();
	}

	void setKnid(String knid) {
		this.knid = knid;
	}

	public String getAccountId() {
		return accountId;
	}

	void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public double getBalanceAmount() {
		return balanceAmount;
	}

	private void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getStatus() {
		return status;
	}

	private void setStatus(String status) {
		this.status = status;
	}

	public String getTransId() {
		return transId;
	}

	private void setTransId(String transId) {
		this.transId = transId;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public double getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	@Override
	public String getAccountStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAccountBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void cashWithDraw() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cashDeposit() {
		// TODO Auto-generated method stub

	}

	@Override
	public Accounts getAccountInfo(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}
