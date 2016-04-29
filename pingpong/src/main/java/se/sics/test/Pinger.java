package se.sics.test;

import se.sics.kompics.ComponentDefinition;
import se.sics.kompics.Positive;
import se.sics.kompics.Handler;
import se.sics.kompics.Start;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pinger extends ComponentDefinition {

		private static final Logger LOG = LoggerFactory.getLogger(Pinger.class);

		Positive<PingPongPort> ppp = requires(PingPongPort.class);

		private long counter = 0;

		Handler<Start> startHandler = new Handler<Start>(){
			public void handle(Start event) {
				trigger(new Ping(), ppp);
			}
		};
		Handler<Pong> pongHandler = new Handler<Pong>(){
			public void handle(Pong event) {
				counter++;
				LOG.info("Got Pong #{}!", counter);
				trigger(new Ping(), ppp);
			}
		};
		{
			subscribe(startHandler, control);
			subscribe(pongHandler, ppp);
		}
	}

