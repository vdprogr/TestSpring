package com.vdprog.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	Client client;
	ConsoleEventLogger eventLogger;
	
	public App(Client client, ConsoleEventLogger eventLogger) {
		
		this.client = client;
		this.eventLogger = eventLogger;
		
	}
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		App app = (App) ctx.getBean("app");
		
		app.logEvents("About client 1 ");
		app.logEvents("About client 2 ");
	
	}
	

	private void logEvents(String s) {
		String message = s.replaceAll(String.valueOf(client.getID()), client.getFullName());
		eventLogger.logEvent(message);
	}
}
