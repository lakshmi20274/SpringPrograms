package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	int eid;
	String enam;
	List skillset;
	Set phoneno;
	Map emailid;
	Department dept;
	public Employee(int eid, String enam, List skillset, Set phoneno,Map emailid,Department dept) {
		super();
		this.eid = eid;
		this.enam = enam;
		this.skillset = skillset;
		this.phoneno = phoneno;
		this.emailid=emailid;
		this.dept=dept;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Map getEmailid() {
		return emailid;
	}
	public void setEmailid(Map emailid) {
		this.emailid = emailid;
	}
	public Employee() {
		
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnam() {
		return enam;
	}
	public void setEnam(String enam) {
		this.enam = enam;
	}
	public List getSkillset() {
		return skillset;
	}
	public void setSkillset(List skillset) {
		this.skillset = skillset;
	}
	public Set getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Set phoneno) {
		this.phoneno = phoneno;
	}

}
