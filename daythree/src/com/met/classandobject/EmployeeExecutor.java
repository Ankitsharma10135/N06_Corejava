package com.met.classandobject;

public class EmployeeExecutor {
	public static void main(String[]args) {
		
		//object creation
		Employee e =new Employee();
		e.empID= 1226;
		e.empName= "Ankit Sharma";
		e.salary= 80000;
		e.department= "cs";
	//method call
		
		e.display();
	}

}
