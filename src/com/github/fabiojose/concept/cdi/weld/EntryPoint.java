package com.github.fabiojose.concept.cdi.weld;

import java.util.List;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import com.github.fabiojose.concept.bean.Access;

public class EntryPoint {

	@Inject private Access access;
	
	public void doit(@Observes ContainerInitialized init, @Parameters List<String> args){		
		System.out.println("Accesso ao sistema: " + access);
	}
	
}
