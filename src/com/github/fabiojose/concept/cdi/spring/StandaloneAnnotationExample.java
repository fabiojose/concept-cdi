package com.github.fabiojose.concept.cdi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.github.fabiojose.concept.bean.Access;
import com.github.fabiojose.concept.bean.Account;
import com.github.fabiojose.concept.bean.Host;

public final class StandaloneAnnotationExample {

	public static void main(String[] args) {
		final AnnotationConfigApplicationContext _context = new AnnotationConfigApplicationContext(Configuration.class);
		final Host _host = (Host)_context.getBean("host");
		System.out.println(_host);
		
		final Account _account = (Account)_context.getBean("account");
		System.out.println(_account);
		
		final Access _access = _context.getBean(Access.class);
		System.out.println(_access);
	}

}
