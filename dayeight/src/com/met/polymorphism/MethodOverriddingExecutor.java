package com.met.polymorphism;
class ChiefMinister
{
	static void corruption(String str1 , float amount1)
	{
		System.out.println(str1 + " coorrupt the amount "+ amount1);
	}
}
class MLA extends ChiefMinister
{
	static void corruption(String str2 , float amount2) 
	{
		ChiefMinister.corruption("shinde", 6128989f);
		System.out.println(str2 + " coorrupt the amount "+ amount2);
	}
}
public class MethodOverriddingExecutor {

	public static void main(String[] args) {
		 MLA.corruption("niusn", 98198f);

	}

}
