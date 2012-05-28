package com.github.fabiojose.concept.cdi.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.github.fabiojose.concept.bean.Access;

@Logging
@Interceptor
public class LoggingAccessInterceptor {

	@AroundInvoke
	public Object intercept(final InvocationContext context) throws Exception {
		
		final Access _access = (Access) context.getTarget();
		System.out.println("Accessing from: " + _access.getHost());
		
		return context.proceed();
	}
}
