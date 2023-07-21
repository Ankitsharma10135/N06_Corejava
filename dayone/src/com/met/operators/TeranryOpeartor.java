package com.met.operators;

import java.util.Scanner;

public class TeranryOpeartor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int num =s.nextInt();
		String result=(num%2==0?"Even":"Odd");
		System.out.println(result);
		

	}

}
