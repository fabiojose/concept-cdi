package com.github.fabiojose.concept.factory;

import javax.enterprise.inject.Produces;

import com.github.fabiojose.concept.bean.Account;

public class AccountFactory {

	@Produces
	public Account localUser(){
		
		final Account _result = new Account();
		_result.setLogin(System.getenv("USERNAME"));
		
		return _result;
		
	}
}
