package com.java.collections.listexamples;

public class Customer {

	private String knid;
	private byte age;
	private int accountid;

	public String getKnid() {
		return knid;
	}

	public void setKnid(String knid) {
		this.knid = knid;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	public Customer(String knid, byte age, int accountid) {
		this.knid = knid;
		this.age = age;
		this.accountid = accountid;
	}

	public Customer(String knid) {
		this.knid = knid;
	}

	public Customer(String knid, byte age) {
		this.knid = knid;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accountid;
		result = prime * result + age;
		result = prime * result + ((knid == null) ? 0 : knid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals: " + this + " vs " + obj);
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (!(obj instanceof Customer))
			return false;

		Customer other = (Customer) obj;

		if (accountid != other.accountid)
			return false;

		if (age != other.age)
			return false;

		if (knid == null) {
			if (other.knid != null)
				return false;
		} else if (!knid.equals(other.knid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [knid=" + knid + ", age=" + age + ", accountid=" + accountid + "]";
	}

}
