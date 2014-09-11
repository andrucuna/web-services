package com.andrucuna.learning.webservice.client;

import com.andrucuna.learning.webservice.HelloWorld;
import com.andrucuna.learning.webservice.HelloWorldImplService;

/**
 * Stand-alone client, invoking the HelloWorld service implemented in "JAXWSServer"
 * @author andrucuna
 */
public class JAXWSClient
{
	public static void main(String[] args) 
	{
		HelloWorldImplService helloWorldService = new HelloWorldImplService();
		HelloWorld helloWorld = helloWorldService.getHelloWorldImplPort();
		
		System.out.println( helloWorld.helloWorld( "Andres" ) );
	}
}
