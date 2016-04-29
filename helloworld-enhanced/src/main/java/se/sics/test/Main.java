package se.sics.test;

import se.sics.kompics.Kompics;
import se.sics.kompics.Component;
import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Init;

public class Main extends ComponentDefinition {
	private Component component1;
	private Component component2;
	public Main() {
		System.out.println("Main component created..");
		component1 = create(Component1.class, Init.NONE);
		component2 = create(Component2.class, Init.NONE);
		connect(component1.getNegative(HelloWorld.class), component2.getPositive(HelloWorld.class));
	}
	
	public static void main(String[] args) {
		Kompics.createAndStart(Main.class);
	}
}