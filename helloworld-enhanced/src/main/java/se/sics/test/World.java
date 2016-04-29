package se.sics.test;

import se.sics.kompics.Event;

public final class World extends Event {
	private final String message; 
	
	public World(String m) {
		message = m;
	}
	
	public String getMessage() {
		return message;
	}
}