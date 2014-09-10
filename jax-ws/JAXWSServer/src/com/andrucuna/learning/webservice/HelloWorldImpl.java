package com.andrucuna.learning.webservice;

import javax.jws.WebService;


@WebService( endpointInterface="com.andrucuna.learning.webservice.HelloWorld" )
public class HelloWorldImpl implements HelloWorld
{
	@Override
	public String helloWorld(String name)
	{
		return "Hello world from " + name;
	}
}
