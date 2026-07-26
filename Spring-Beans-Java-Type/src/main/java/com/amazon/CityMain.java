package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.config.CityConfig;
import com.amazon.beans.City;

public class CityMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CityConfig.class);
		
		City city = (City) context.getBean("cty");
		city.getDetails();

	}

}
