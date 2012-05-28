package com.github.fabiojose.concept.bean;

import java.io.Serializable;

import javax.enterprise.inject.Alternative;

@Alternative
public class Host implements Serializable {
	private static final long serialVersionUID = -1279213128225928296L;

	private String address;


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Host [address=" + address + "]";
	}

}
