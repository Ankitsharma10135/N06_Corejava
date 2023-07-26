package com.met.decisionstatememts;
import java.util.Scanner;
public class Cascadedifelse {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s= new Scanner(System.in);
	System.out.println("Enter age1 :");
	int age1=s.nextInt();
	
	System.out.println("Enter age2 :");
	int age2=s.nextInt();
	
	System.out.println("Enter age3 :");
	int age3=s.nextInt();
	
	if (age1>age2 && age2>age3)
	{
		System.out.println("Age1 is greater");
		
	}
	

	

	}

}
