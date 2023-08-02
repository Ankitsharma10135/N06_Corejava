package com.met.superkeyword;
class Building {
	
	int floors=23;
	String name= "Anantha";
}
class Flat extends Building{
	String name="Ankit Sharma";
	
	void print() {
		
		System.out.println(super.name);
		System.out.println(name);
	}
}


public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f=new Flat();
		f.print();

	}

}
