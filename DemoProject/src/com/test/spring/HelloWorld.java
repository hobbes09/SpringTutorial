package com.test.spring;
//http://www.dineshonjava.com/2012/06/hello-word-example-in-spring.html#.VcNtAJOqqko

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
