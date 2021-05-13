package annotations1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Customer {
	int cid;
	String cname;
	@PostConstruct
	private void init() {
		System.out.println("init method invoked");
	}
	@PreDestroy
	private void shutdown() {
		System.out.println("destroy method invoked");
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Customer() {
		
	}

}
