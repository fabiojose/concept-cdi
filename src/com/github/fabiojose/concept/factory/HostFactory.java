package com.github.fabiojose.concept.factory;

import javax.enterprise.inject.Produces;

import com.github.fabiojose.concept.bean.Host;

public final class HostFactory {

	@Produces
	public Host localhost(){
		
		final Host _host = new Host();
		_host.setAddress("127.0.0.1");
		
		return _host;
	}
}
