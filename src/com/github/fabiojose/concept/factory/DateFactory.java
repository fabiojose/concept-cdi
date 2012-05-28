package com.github.fabiojose.concept.factory;

import java.util.Date;

import javax.enterprise.inject.Produces;

public final class DateFactory {

	@Produces
	public Date now(){
		return new Date();
	}
}
