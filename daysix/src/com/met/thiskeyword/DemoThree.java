package com.met.thiskeyword;

class Team{
	int size;
	Team()
	{
		this(7);
		System.out.println("Default constructor");
	}
	Team(int size){
		System.out.println("Parametrize constructor: "+size);
	}
	
}

public class DemoThree {

	public static void main(String[] args) {
		Team t=new Team();
		
		

	}

}
