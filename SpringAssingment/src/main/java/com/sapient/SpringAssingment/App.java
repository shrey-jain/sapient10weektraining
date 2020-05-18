package com.sapient.SpringAssingment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("mobileContext.xml");
		Mobile mobile = (Mobile) factory.getBean("mobile");

		mobile.code();
	}
}
