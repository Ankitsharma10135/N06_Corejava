//Program to demonstrate on bunjee jumping using 
package com.met.decisionstatememts;
import java.util.Scanner;
public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = s.nextInt();
		
		System.out.println("Enter the weight :");
		int weight =s.nextInt();
	
		if(age>=12) {
			
			if(weight>40) 
			{
			
			System.out.println("Eligible for jumping");
			}
			if(weight>110)
			{
				System.out.println("Extra ropes required");
			
			}
		}
		else {
			System.out.println("Not Eligible");
		}
		

	}

}
