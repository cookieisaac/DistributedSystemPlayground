package se.sics.test;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Component;
import se.sics.kompics.Init;

public class Parent extends ComponentDefinition {
		Component pinger = create(Pinger.class, Init.NONE);
		Component ponger = create(Ponger.class, Init.NONE);

		{
			connect(pinger.getNegative(PingPongPort.class), ponger.getPositive(PingPongPort.class));
		}
	}

