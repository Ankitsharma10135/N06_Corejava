package com.met.SingleDimensionalArray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
	Employees arr[]= new Employees[3];
	arr[0]= new Employees(101 , "ABC", 2298.62 );
	arr[1]= new Employees(102 , "XYZ", 2978.34 );
	arr[2]= new Employees(101 , "CDE", 2618.98 );
	
	for(int i=0; i<3; i++) {
		
		System.out.println(arr[i].getID()+ " "+arr[i].getName() + " "+ arr[i].getSalary());
	}

	}

}
