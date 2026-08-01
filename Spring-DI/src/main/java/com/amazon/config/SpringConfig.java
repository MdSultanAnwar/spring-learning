package com.amazon.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.di.setter.address.Address;
import com.amazon.di.setter.emp.Employee;

//import com.amazon.di.constructor.address.Address;
//import com.amazon.di.constructor.emp.Employee;

@Configuration
public class SpringConfig
{
	@Bean
	public Address address()

	{
		Address address = new Address("28th Main", "17th Cross", "BLR", "Karnatka");
		return address;
	}

//	@Bean("emp1")
//	public Employee employee(Address address)
//	{
//		Employee employee = new Employee(120000, "Md Sultan Anwar", address); // address is mandatory 
//		return employee;
//	}

	
	  @Bean("emp2") public Employee employee(Address address) {
	  com.amazon.di.setter.emp.Employee employee = new Employee(120000,
	  "Md Sultan Anwar");
	  
	  employee.setAddress(address); // Optional return employee; 
	  return employee;
	  }
	 

	/*@Bean("emp2")
	public Employee employee(Address address)
	{
		com.amazon.di.setter.emp.Employee employee = new Employee(120000, "Md Sultan Anwar");

		return employee;
	}*/

}

