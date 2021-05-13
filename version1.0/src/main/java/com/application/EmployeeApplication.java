package com.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Employee e1=(Employee)ac.getBean("embean");
		System.out.println(e1.getEid());
		System.out.println(e1.getEnam());
		System.out.println(e1.getSkillset());
		System.out.println(e1.getPhoneno());
		System.out.println(e1.getEmailid());
		System.out.println(e1.getDept());
	}

}
