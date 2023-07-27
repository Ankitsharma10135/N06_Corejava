package com.met.hirerchicalinheritance;

public class SnowCode extends Android{
private int version;
	
	
	

	public int getVersion() {
		return version;
	}




	public void setVersion(int version) {
		this.version = version;
	}




	public SnowCode(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}




	@Override
	public String toString() {
		return "SnowCode [version=" + version + ", toString()=" + super.toString() + "]";
	}



}
