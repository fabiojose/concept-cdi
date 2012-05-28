package com.github.fabiojose.concept.bean;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Inject;

import com.github.fabiojose.concept.cdi.interceptor.Logging;

@Logging
public class Access implements Serializable {
	private static final long serialVersionUID = -9167597581472317140L;

	@Inject private Host host;
	@Inject private Account account;
	@Inject private Date time;
	
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Access [host=" + host + ", account=" + account + ", time="
				+ time + "]";
	}

}
