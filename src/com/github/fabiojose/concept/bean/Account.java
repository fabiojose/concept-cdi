package com.github.fabiojose.concept.bean;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;

@Alternative
public class Account implements Serializable {
	private static final long serialVersionUID = -8163802864555240461L;

	private String login;
	private char[] password;
	
	public Account(){
		
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Account [login=" + login + "]";
	}

}
