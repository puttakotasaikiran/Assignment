package com.dxc.springcoreassignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreeterService {
	@Autowired
	@Qualifier("morningGreeting")
	Greeting greeting;
	void printGreeting()
	{
		System.out.println(greeting.greet());
	}

}
