package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Actmain {
public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanac.xml");
		Account al=(Account)ac.getBean("ac");
		System.out.println("emter account details");
		Scanner s=new Scanner(System.in);
		List l=new ArrayList();
		l.add(s.nextInt());
		l.add(s.next());
		al.setAct(l);
		System.out.println(al.getAct().toString());
	}

}
