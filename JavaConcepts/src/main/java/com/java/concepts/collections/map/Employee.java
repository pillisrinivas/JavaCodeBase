package com.java.concepts.collections.map;

public class Employee {
	private Integer id;
    private String name;
    private String city;
    private int pin;

    public Employee(Integer id, String name, String city, int pin) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.pin = pin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}
