package annotations1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Customermain {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();
		Customer mb1=ctx.getBean(Customer.class);
		System.out.println(mb1.hashCode());
		mb1.setCid(100);
		System.out.println(mb1.getCid());
		mb1.setCname("lakshmi");
		System.out.println(mb1.getCname());
		ctx.close();
	}
}
