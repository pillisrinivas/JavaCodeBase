package com.java.concepts.collections.map;

public class Customer {
	private String knid; // unique for a given customer
	private String name;
	private int age;
	private String city;
	private String customerType;
	private String custGroup;

	public String getCustGroup() {
		return custGroup;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public String getKnid() {
		return knid;
	}

	public void setKnid(String knid) {
		this.knid = knid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((knid == null) ? 0 : knid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (knid == null) {
			if (other.knid != null)
				return false;
		} else if (!knid.equals(other.knid))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [knid=" + knid + ", name=" + name + ", age=" + age + ", city=" + city + ", customerType="
				+ customerType + "]";
	}

	public Customer(String knid, String name, int age, String city, String custGroup) {
		this.knid = knid;
		this.name = name;
		this.age = age;
		this.city = city;
		this.custGroup = custGroup;
	}

//	Default constructor
	public Customer() {
	}

//	@Override
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return this.getKnid().compareTo(o.getKnid());
//	}
}
