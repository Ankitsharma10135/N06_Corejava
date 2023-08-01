package com.met.thiskeyword;

class Bank{
	long  accountNo;
	Bank(long accountNo){
	
	this.accountNo=accountNo;
	}
	void display() {
		
		System.out.println(accountNo);
	}
}

public class DemoTwo {

	public static void main(String[] args) {
		Bank b=new Bank(318146648L);
		b.display();
		

	}

}
