package task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Custmain {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        ApplicationContext ac = new ClassPathXmlApplicationContext("beancust.xml");
        Customer e = (Customer)ac.getBean("cust");
        System.out.println(e.toString());

 

    }

}
