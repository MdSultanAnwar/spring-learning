package com.amazon.di.setter.emp;

import org.springframework.beans.factory.annotation.Autowired;

import com.amazon.di.setter.address.Address;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Employee
{
	private int salary;
	private String name;

	private Address address;

	// We are passing dependencies using setter.
	public Employee(int salary, String name)
	{
		super();
		System.out.println("1. Employee.Employee()  - Constructor ");
		this.salary = salary;
		this.name = name;

	}

	public void setAddress(Address _address)
	{
		System.out.println("2. Employee.Employee()  - Dependency Injection");
		this.address = _address;
	}

	public void printInfo()
	{
		System.out.println("4. Employee.Employee()  - Doing Work ");
		address.displayAddressInfo();
	}

	@PostConstruct
	public void init()
	{
		System.out.println("3. Employee.Employee()  - Init ");

	}

	@PreDestroy
	public void cleanUp()
	{
		System.out.println("5. Employee.Employee() - doing clean up before destroy. ");

	}

}
