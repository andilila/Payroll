package com.company;
import java.util.Date;


/**
 * Created by Andi Lila on 10/31/2016.
 */
public class PaymentMethod {

    private String address;
    private String accountNumber;
    private boolean isHeld;
    
    public PaymentMethod(){
    	super();
    }
    
    public PaymentMethod(String accountNumber){
    	this.setAccountNumber(accountNumber);
    }
    public PaymentMethod(String address, boolean isHeld){
    	this.setAddress(address);
    	this.setHeld(isHeld);
    }
    
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public boolean isHeld() {
		return isHeld;
	}
	public void setHeld(boolean isHeld) {
		this.isHeld = isHeld;
	}
}
