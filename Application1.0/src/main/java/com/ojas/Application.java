package com.ojas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Employee employee = (Employee) context.getBean("emp");
		System.out.println(employee.toString());
	}
}
