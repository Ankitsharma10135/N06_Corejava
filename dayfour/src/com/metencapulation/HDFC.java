//Program to demonstrate on encapsulation
/* encapsulation achives8*/

package com.metencapulation;

public class HDFC {
	
	//Private data members
	
	private String accType;
	private long accountNo;
	private long atmcardNo;
	private int pinNo;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getAtmcardNo() {
		return atmcardNo;
	}
	public void setAtmcardNo(long atmcardNo) {
		this.atmcardNo = atmcardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNo=" + accountNo + ", atmcardNo=" + atmcardNo + ", pinNo=" + pinNo
				+ "]";
	}

}
