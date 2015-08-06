package com.test.spring;
// http://www.dineshonjava.com/2012/06/hello-word-example-in-spring.html#.VcNtAJOqqko

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class SpringTestApp {
	public static void main(String[] args){  
		//ClassPathXmlApplicationContext is load all beans in the application  
	    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
	         
	    //this step is used to get required bean using getBean() method of the created context  
	    HelloWorld helloWorld= (HelloWorld) context.getBean("helloWorld");  
	    helloWorld.getMessage(); 
	}  
}
