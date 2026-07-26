package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.beans.City;

@Configuration
public class CityConfig
{

	@Bean("cty")
	public City getDetails()
	{
		City city = new City();
		city.setName("Patna");
		city.setCode(+91);
		city.setState("BIHAR");
		return city;
	}
}
