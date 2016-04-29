package se.sics.test;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Start;
import se.sics.kompics.Kompics;
import se.sics.kompics.Negative;

public class Component2 extends ComponentDefinition {
	private Negative<HelloWorld> hwPort = provides(HelloWorld.class);
	
	public Component2() {
		System.out.println("Component2 Created...");
		subscribe(startHandler, control);
		subscribe(helloHandler, hwPort);
	}
	
	Handler<Start> startHandler = new Handler<Start>(){
		@Override
		public void handle(Start event) {
			System.out.println("Component2 started.");
		}
	};
	
	Handler<Hello> helloHandler = new Handler<Hello>() {
		@Override
		public void handle(Hello event) {
			System.out.println("Component2 received hello event: " + event.getMessage());
			trigger(new World("What's up"), hwPort);
		}
	};
}

