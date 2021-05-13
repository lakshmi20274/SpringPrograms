package bankapplication;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Customer {
	int custId;
	String custName;
	String phoneNumber;
	Set<Loan> loans;
	Set<Account> accounts;
	List<Transcations> transaction;
	Float blanace;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<Loan> getLoans() {
		return loans;
	}
	public void setLoans(Set<Loan> loans) {
		this.loans = loans;
	}
	public Set<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}
	public List<Transcations> getTransaction() {
		return transaction;
	}
	public void setTransaction(List<Transcations> transaction) {
		this.transaction = transaction;
	}
	
	public Float getBlanace() {
		return blanace;
	}
	public void setBlanace(Float blanace) {
		this.blanace = blanace;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int custId, String custName, String phoneNumber, Set<Loan> loans, Set<Account> accounts,
			List<Transcations> transaction, Float blanace) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.loans = loans;
		this.accounts = accounts;
		this.transaction = transaction;
		this.blanace = blanace;
	}
	public void dispDetails() {
		System.out.println("Customer id: " + custId + " Name: "+ custName + " Phone: " + phoneNumber);
		Iterator<Account> itr1 = accounts.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		Iterator<Loan> itr2 = loans.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		Iterator<Transcations> itr3 = transaction.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		System.out.println("Current Balance " + blanace);
	}
	
	


}
