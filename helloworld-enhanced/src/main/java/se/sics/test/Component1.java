package se.sics.test;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Handler;
import se.sics.kompics.Start;
import se.sics.kompics.Kompics;
import se.sics.kompics.Positive;

public class Component1 extends ComponentDefinition {
	private Positive<HelloWorld> hwPort = requires(HelloWorld.class);
	
	public Component1() {
		System.out.println("Component1 Created...");
		subscribe(startHandler, control);
		subscribe(worldHandler, hwPort);
	}
	
	Handler<Start> startHandler = new Handler<Start>(){
		@Override
		public void handle(Start event) {
			System.out.println("Component1 started. Triggering Hello...");
			trigger(new Hello("Hi, there!"), hwPort);
		}
	};
	
	Handler<World> worldHandler = new Handler<World>() {
		@Override
		public void handle(World event) {
			System.out.println("Component1 received world event: " + event.getMessage());
		}
	};
}

