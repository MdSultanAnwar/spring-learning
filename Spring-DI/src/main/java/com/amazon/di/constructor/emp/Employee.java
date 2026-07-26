package com.amazon.di.constructor.emp;

import com.amazon.di.constructor.address.Address;

public class Employee
{
	private int salary;
	private String name;
	
	private Address address;
	
  // We are passing dependencies using constructor. (Immutable)
	public Employee(int salary, String name, Address address)
	{
		super();
		this.salary = salary;
		this.name = name;
		this.address = address;
	}
	
	public void getInfo()
	{
		address.displayAddressInfo();
	}
	
	

}
