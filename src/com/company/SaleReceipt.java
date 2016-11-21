package com.company;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class SaleReceipt {

    // receipt ID
    private int recId;
    private double recValue;
    
    //Constructors
    public SaleReceipt(int recId, double recValue){
    	this.setRecId(recId);
    	this.setRecValue(recValue);
    }
    
    //Methods
    
    //Getters and Setters
	public int getRecId() {
		return recId;
	}

	public void setRecId(int recId) {
		if(recId >= 0)
			this.recId = recId;
	}

	public double getRecValue() {
		return recValue;
	}

	public void setRecValue(double recValue) {
		if(recValue >= 0)
			this.recValue = recValue;
	}

}
