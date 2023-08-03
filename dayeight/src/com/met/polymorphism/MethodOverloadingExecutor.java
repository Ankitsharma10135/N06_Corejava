package com.met.polymorphism;
class Bollywood{
 static String showCouples(String str1 , String str2)
{
	return str1+" "+"lobus"+" "+str2;
	
}

	static String showCouples(String str1, String str2,String str3)
	{
		return str1 +" " + "lobus" +" " + str2 + " as well as"+" " + str3;
	}
		
 
	}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(Bollywood.showCouples("salu Bhai", "Ashwarya"));
		System.out.println(Bollywood.showCouples("sallu Bhai", "Ashwarya", "SunnyLeon"));

	}

}
