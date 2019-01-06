package com.java.concepts.collections.set;

public class CustomerTree implements CustomerSortType, Comparable<CustomerTree> {
	private String knid;
	private String name;
	private int age;

	public CustomerTree(String knid) {
		this(knid, "No name", -1);
	}

	@Override
	public int compareTo(CustomerTree o) {
//		System.out.println("CompareTo method in CustomerTree");
		int i = this.age > o.age ? 1 : this.age < o.age ? -1 : 0;
		return i;
	}

	public CustomerTree(String knid, String name) {
		this(knid, name, -1);
	}

	public CustomerTree(String knid, String name, int age) {
		this.knid = knid;
		this.name = name;
		this.age = age;
	}

	public String getKnid() {
		return knid;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setKnid(String knid) {
		this.knid = knid;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + age;
//		result = prime * result + ((knid == null) ? 0 : knid.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		System.out.println("HashCode value: " + result);
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("Equals comparision:" + this.toString() + " vs " + obj.toString());
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (!(obj instanceof CustomerTree))
//			return false;
//		CustomerTree other = (CustomerTree) obj;
//		if (age != other.age)
//			return false;
//		if (knid == null) {
//			if (other.knid != null)
//				return false;
//		} else if (!knid.equals(other.knid))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}

	@Override
	public String toString() {
		return "Customer [knid=" + knid + ", name=" + name + ", age=" + age + "]";
	}

}
