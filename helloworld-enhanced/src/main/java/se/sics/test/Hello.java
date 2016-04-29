package se.sics.test;

import se.sics.kompics.Event;

public final class Hello extends Event {
	private final String message; 
	
	public Hello(String m) {
		message = m;
	}
	
	public String getMessage() {
		return message;
	}
}