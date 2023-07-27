package com.met.multilevelinheritance;

public class Manager {
	
	//Private data members
	private String deptname;
	private String name;
	private int empId;
	
	
	//Getters and setters
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		return "Manager [deptname=" + deptname + ", name=" + name + ", empId=" + empId + "]";
	}
	
	//Parameter Constructor
	public Manager(String deptname, String name, int empId) {
		super();
		this.deptname = deptname;
		this.name = name;
		this.empId = empId;
	}
	

}
