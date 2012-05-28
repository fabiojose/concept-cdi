package com.github.fabiojose.concept.cdi.spring;

import org.springframework.context.annotation.Bean;

import com.github.fabiojose.concept.bean.Access;
import com.github.fabiojose.concept.bean.Account;
import com.github.fabiojose.concept.bean.Host;

@org.springframework.context.annotation.Configuration
public class Configuration {

	@Bean
	public Host host(){
		
		return null;
	}
	
	@Bean
	public Account account(){
		
		return null;
	}
	
	@Bean
	public Access access(){
		
		return null;
	}
}
