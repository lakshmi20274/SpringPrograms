package com.ojas;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	int eId;
	String eName;
	double sal;
	Department dept;
	List skillset;
	Set phoneNumber;
	Map emailId;

	public Employee() {
		super();
		
	}

	public Employee(int eId, String eName, List skillset, Set phoneNumber, Map emailId, double sal, Department dept) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.skillset = skillset;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.sal = sal;
		this.dept = dept;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List getSkillset() {
		return skillset;
	}

	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}

	public Set getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Map getEmailId() {
		return emailId;
	}

	public void setEmailId(Map emailId) {
		this.emailId = emailId;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", skillset=" + skillset + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", sal=" + sal + ", dept=" + dept + "]";
	}

}
