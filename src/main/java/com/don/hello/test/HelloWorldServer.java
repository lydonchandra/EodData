package com.don.hello.test;

import org.apache.cxf.frontend.ServerFactoryBean;

public class HelloWorldServer {

	public static void main(String[] args) {
		HelloWorldImpl impl = new HelloWorldImpl();
		
		ServerFactoryBean svr = new ServerFactoryBean();
		svr.setServiceClass(HelloWorld.class);
		svr.setAddress("http://localhost:9000/Hello");
		svr.setServiceBean(impl);
		svr.create();
		
	}

}
