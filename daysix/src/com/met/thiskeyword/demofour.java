package com.met.thiskeyword;

class Director
{
	String name;
	void print()
	{
		this.name="Sunil Datt"; 
		display(name);
	}
	void display(String name) {
		System.out.println("Director name is: "+name);
	}
	
}
public class demofour {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
		System.out.println(d.name);
	}

}