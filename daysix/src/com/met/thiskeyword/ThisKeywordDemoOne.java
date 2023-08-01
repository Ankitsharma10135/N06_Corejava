package com.met.thiskeyword;
class Account{
	long accountNo;
	
	void setData(long accountNo)
	{
		this.accountNo = accountNo;
	}
	
	void display() 
	{
		
		System.out.println(accountNo);
	}
}

// Driver Class
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a = new Account();
//		a.accountNo = 4523678L;  --> This will give the accountNo directly
		a.setData(4523678L);
		a.display();

	}

}