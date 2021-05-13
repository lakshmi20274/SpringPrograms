package task;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Order implements InitializingBean,DisposableBean{
	int order_value;

	public int getOrder_value() {
		return order_value;
	}

	public void setOrder_value(int order_value) {
		this.order_value = order_value;
	}

	public void destroy() throws Exception {
		System.out.println("Destroy method");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init() method");
		
		
	}
	

}
