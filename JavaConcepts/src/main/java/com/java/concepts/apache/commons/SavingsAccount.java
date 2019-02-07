package com.java.concepts.apache.commons;

import com.java.concepts.apache.commons.*;

public class SavingsAccount implements Accounts, Comparable<SavingsAccount>  {

	private String knid;
	private String accountId;
	private double balanceAmount;
	private String status;
	private String transId; // Unique transaction id
	private String transType;
	private double transAmount;
	private String custGroup;
	private SavingsAccount sac; //Accounts object - can be of type Savings or Current or Loan
	
	private Customer cust;
	private CustomerS cust1;
	private CustomerT cust2;
	

	public SavingsAccount(Customer cust) {
		this.cust = cust;
		this.knid = cust.getKnid();
		this.custGroup = cust.getCustGroup();
		getAccountDetials();
	}

	public SavingsAccount(CustomerS cust1) {
		this.cust1 = cust1;
		this.knid = cust1.getKnid();
		this.custGroup = cust1.getCustGroup();
		getAccountDetials();
	}

	public SavingsAccount(CustomerT cust2) {
		this.cust2 = cust2;
		this.knid = cust2.getKnid();
		this.custGroup = cust2.getCustGroup();
		getAccountDetials();
	}

	public String getCustGroup() {
		return custGroup;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public SavingsAccount(String knid, String accountId) {
		this.knid = knid;
		this.accountId = accountId;
	}
	
	public SavingsAccount(String knid) {
		this.knid = knid;
		getAccountDetials();
	}

	public String getKnid() {
		return this.knid; //cust.getKnid();
	}

	private void setKnid(String knid) {
		this.knid = knid;
	}

	public String getAccountId() {
		if (this.knid.equals("2910813709")) {
			accountId = "Srini01";
			return accountId;
		} else
		if (this.knid.equals("2801896768")) {
			accountId = "Siri01";
			return accountId;
		} else
		if (this.knid.equals("4738459956")) {
			accountId = "Jens01";
			return accountId;
		} else
		if (this.knid.equals("6757483949")) {
			accountId = "Band01";
			return accountId;
		} else 
			return accountId;
	}

	public void setAccountId(String accountId) {
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

	private void setTransType(String transType) {
		this.transType = transType;
	}

	public double getTransAmount() {
		return transAmount;
	}

	private void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}

	@Override
	public String getAccountStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getAccountBalance() {
		if (this.knid.equals("2910813709")) {
			balanceAmount = 1000000000.00;
			return balanceAmount;
		} else
		if (this.knid.equals("2801896768")) {
			balanceAmount = 5000000000.00;
			return balanceAmount;
		} else
		if (this.knid.equals("4738459956")) {
			balanceAmount = 4650000.00;
			return balanceAmount;
		} else
		if (this.knid.equals("6757483949")) {
			balanceAmount = 7650000.00;
			return balanceAmount;
		} else 
			return -1;
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
		if (obj instanceof SavingsAccount) {
			sac = (SavingsAccount) obj;
		}
//		SavingsAccount acc = new SavingsAccount("2910813709", "001");
		getAccountDetials();
		System.out.println("Account details of " + sac.getKnid() + ": ");
		System.out.println("Balance: " + sac.getAccountBalance());
		return sac;
	}
	
	public void getAccountInfo() {
		getAccountDetials();
	}

	@Override
	public String toString() {
		return "SavingsAccount [knid=" + knid + ", accountId=" + accountId + ", balanceAmount=" + balanceAmount
				+ ", custGroup=" + custGroup + "]";
	}

	private void getAccountDetials() {
		this.accountId = getAccountId();
		this.balanceAmount = getAccountBalance();
		this.status = getStatus();
	}

	@Override
	public int compareTo(SavingsAccount o) {
		return this.getKnid().compareTo(o.getKnid());
	}
}
