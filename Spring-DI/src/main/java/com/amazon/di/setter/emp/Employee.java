package com.amazon.di.setter.emp;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazon.di.setter.address.Address;

public class Employee
{
	private int salary;
	private String name;

	@Autowired
	private Address address;

	// We are passing dependencies using setter.
	public Employee(int salary, String name)
	{
		super();
		this.salary = salary;
		this.name = name;

	}

	public void setAddress(Address _address)
	{
		this.address = _address;
	}

	public void printInfo()
	{
		address.displayAddressInfo();
	}

}
