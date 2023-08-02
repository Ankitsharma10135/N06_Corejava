package com.met.statickeyword;

public class StaticBlockExecutor {
	String str;
	static float salary;
	
	static {
		salary=291298f;
		//str="BKC";
		
	}
static void print ()
{
	System.out.println(salary);
}
	public static void main(String[] args) {
		print();
		

	}

}
