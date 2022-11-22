package com.coding_with_chandra;

public class Employee {

	private String empName;
	private String mobile;
	
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Employee(String empName, String mobile) {
		super();
		this.empName = empName;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", mobile=" + mobile + "]";
	}
	
	
}
