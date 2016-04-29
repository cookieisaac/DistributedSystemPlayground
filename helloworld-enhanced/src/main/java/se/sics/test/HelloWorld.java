package se.sics.test;

import se.sics.kompics.PortType;

public class HelloWorld extends PortType{{
	indication(World.class);
	request(Hello.class);
}}