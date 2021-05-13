package com.ojas;

public class Department {
int deptNo;
String deptName;
public Department() {
	super();
	
}
public Department(int deptNo, String deptName) {
	super();
	this.deptNo = deptNo;
	this.deptName = deptName;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
@Override
public String toString() {
	return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
}

}
