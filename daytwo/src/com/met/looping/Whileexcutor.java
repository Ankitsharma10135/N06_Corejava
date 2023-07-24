package com.met.looping;
import java.util.Scanner;
public class Whileexcutor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		while(num>=1) {
		    System.out.println(num + " ");
		    num--;}
	}

}
