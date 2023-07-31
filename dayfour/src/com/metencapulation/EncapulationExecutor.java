package com.metencapulation;

public class EncapulationExecutor {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		
		//setting a value to private data member
		h.setAccType("Saving Account");
		h.setAccountNo(1981891119L);
		h.setAtmcardNo(1611919919L);
		h.setPinNo(4638);
		
		System.out.println(h);

	}

	
}
