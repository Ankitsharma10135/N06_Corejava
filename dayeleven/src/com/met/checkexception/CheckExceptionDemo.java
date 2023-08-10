package com.met.checkexception;

import java.io.FileInputStream;

public class CheckExceptionDemo {
	

	public static void main(String[] args) {
		try {
	@SuppressWarnings("unused")
	FileInputStream f=new FileInputStream("C:\\Users\\Ankit\\OneDrive\\Documents\\N06\\codingchallange");
	System.out.println("File is exist!!");
		}
		catch(Exception e) {
			System.out.println("Exception Handling" +e);
		
		}

	}

}
