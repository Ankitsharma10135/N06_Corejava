package com.met.statickeyword;
class Employee
{
	private int empId;
	private String name;
	private static String companyName="MetBkc";
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	@SuppressWarnings("static-access")
	void display()
	{
		System.out.println(" Emp ID : "+this.getEmpId()+" "+"Emp Name : "+this.getName()+" "+"Company Name: "+ " "+this.getCompanyName());

	}
	
}

public class staticVariable {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("Ankit");
		e.display();
		
	}

}