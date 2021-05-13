package task;
import org.springframework
.context
.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderMain {
	
	public static void main(String args[]) {
		ConfigurableApplicationContext con=new ClassPathXmlApplicationContext("orderbean.xml");
		Order obj=(Order)con.getBean("ord");
		System.out.println(obj.getOrder_value());
		con.close();
	}

}
