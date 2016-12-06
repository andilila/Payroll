package com.company;
import java.util.Date;


/**
 * Created by Andi Lila on 10/31/2016.
 */
public class PaymentMethod {

    private String address;
    private int accountNumber; 
    
    public PaymentMethod(){
    	super();
    }
    
    public PaymentMethod(int accountNumber){
    	this.setAccountNumber(accountNumber);
    }
    public PaymentMethod(String address){
    	this.setAddress(address);
    }
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
}
