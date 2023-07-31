//Program to demonstrate on access specifier;
package com.bkcmet.library;

public class Library {
	public String libraryName;
	private long userId;
	String booksName;
	//Public Method
	
	public void displayPublic()
	{
		System.out.println("Library Name :"+libraryName);
	}
	
	//Private Method
	
	private void displayPrivate()
	{
		System.out.println("User Id"+ userId);
	}
	
	//Default Method
	
	void diplayDefault()
	{
		System.out.println("BookName is :"+booksName);
	}

}
