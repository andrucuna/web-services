package com.andrucuna.learning.webservice;

import javax.xml.ws.Endpoint;

/**
 * Implement this to run as a standalone-WS publishing an endpoint, 
 * at which point it starts accepting incoming requests.
 * @author andrucuna
 */
public class HelloWorldWSPublisher 
{
	public static void main(String[] args)
	{
		Endpoint.publish( "http://localhost:8080/WS/HelloWorld", new HelloWorldImpl() );
	}
}
