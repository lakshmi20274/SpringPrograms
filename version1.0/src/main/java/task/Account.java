package task;

import java.util.List;

public class Account {
	List<Account> act;

	@Override
	public String toString() {
		return "Account [act=" + act + "]";
	}

	public List<Account> getAct() {
		return act;
	}

	public void setAct(List<Account> act) {
		this.act = act;
	}
	

}
