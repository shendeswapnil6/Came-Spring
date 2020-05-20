package com.fusefirst.camel_hello_world;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelUsingSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	        ctx.start();
	        System.out.println("Application context started");
	        try {
	            Thread.sleep(5 * 60 * 1000);
	        }
	        catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        ctx.stop();
	        ctx.close();
	    }
	}