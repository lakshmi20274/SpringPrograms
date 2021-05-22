package com.login;

public class Doctor {
	 int regnum;
	    String drname;
	    String clinicname;
	    long drfees;
	    public Doctor() {
	        
	    }
	    public Doctor(int regnum, String drname, String clinicname, long drfees) {
	        super();
	        this.regnum = regnum;
	        this.drname = drname;
	        this.clinicname = clinicname;
	        this.drfees = drfees;
	    }
		public int getRegnum() {
			return regnum;
		}
		public void setRegnum(int regnum) {
			this.regnum = regnum;
		}
		public String getDrname() {
			return drname;
		}
		public void setDrname(String drname) {
			this.drname = drname;
		}
		public String getClinicname() {
			return clinicname;
		}
		public void setClinicname(String clinicname) {
			this.clinicname = clinicname;
		}
		public long getDrfees() {
			return drfees;
		}
		public void setDrfees(long drfees) {
			this.drfees = drfees;
		}
	    
}
