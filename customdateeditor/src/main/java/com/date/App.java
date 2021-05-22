package com.date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CustomDate;

public class App {
	
	
	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			CustomDate hello = (CustomDate) context.getBean("CustomDateBean");
			
			System.out.println("Date is : " + hello.getDate());
					
	}
}