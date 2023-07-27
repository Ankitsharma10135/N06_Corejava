package com.met.multilevelinheritance;

public class Teamlead extends Manager{
	
	private String leadName;
	private String projectName;
	
	
	// Getters and Setters

	public String getLeadName() {
		return leadName;
	}




	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	

// to String using fields 


	public Teamlead(String deptname, String name, int empId, String leadName, String projectName) {
		super(deptname, name, empId);
		this.leadName = leadName;
		this.projectName = projectName;
	}




	@Override
	public String toString() {
		return "Teamlead [leadName=" + leadName + ", projectName=" + projectName + ", toString()=" + super.toString()
				+ "]";
	}




	
		
	

}
