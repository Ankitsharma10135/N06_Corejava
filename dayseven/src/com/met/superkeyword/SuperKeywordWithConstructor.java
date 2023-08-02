package com.met.superkeyword;
class Google
{
     String ceo;
     public Google(String ceo) {
    	 System.out.println("Default Constructor: "+ceo);
     }
	
	
}

class Gmail extends Google
{
	String userid;
	public Gmail (String ceo, String userid) {
		super(ceo);
		this.userid = userid;
		System.out.println(userid);
	}
	
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g=new Gmail("Sundra Pichai", "abc@gamil.com");
		
		

	}

}
