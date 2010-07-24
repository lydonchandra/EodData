package com.don.hello.test;

import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class HelloWorldClient {

	public static void main(String[] args) {
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://localhost:9000/Hello");
		HelloWorld client = (HelloWorld) factory.create();
		System.out.println(client.sayHi("dondon"));
		
		
		factory.setServiceClass(HelloWorld.class);
		factory.setAddress("http://localhost:9000/Hello");
		
		
	}

}
