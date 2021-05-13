package com.bankmain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bankapplication.Customer;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("bankbean.xml");
		Customer c = (Customer)ac.getBean("bank1");
		c.dispDetails();

	}

}
