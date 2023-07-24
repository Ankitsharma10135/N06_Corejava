package com.met.decisionstatememts;
import java.util.Scanner;
public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.print("Enter songno. : ");
		int songno = s.nextInt();
		
		switch(songno)
		{
		
		case 1:
			System.out.println("Jai Shree Ram");
			break;
			
		case 2:
			System.out.println("Faded");
			break;
		
		case 3:
			System.out.println("Safar");
			break;
			
		default:
			System.out.println("Enter a valid Input");
		 
		}

	}

}
