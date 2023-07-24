package com.met.decisionstatememts;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		System.out.println("Enter the Age here : ");
		Scanner s= new Scanner(System.in);
		int age = s.nextInt();
		
		System.out.println("Enter the weight here :");
		int weight= s.nextInt();
		
		if (age>18 && weight>50)
		{
			System.out.println("Not Eligible");
			
			
		}

	}

}
