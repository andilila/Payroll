package com.company;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class SaleReceipt {

    // receipt ID
    private int recID;

    // Receipt value
    private double recValue;
    private int employeeID;
    private double commissionsRate;    
    
    public SaleReceipt(int recID, double recValue, int employeeID, double commissionsRate){
    	this.setRecID(recID);
    	this.setRecValue(recValue);
    	this.setEmployeeID(employeeID);
    	this.setCommissionsRate(commissionsRate);
    }
//methods
    public double getCommission(){
    	double Commission;
    	return 0.00;
    }
    
	public int getEmployeeID() {		
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		if(employeeID >= 0)
		this.employeeID = employeeID;
	}

	public double getCommissionsRate() {
		return commissionsRate;
	}

	public void setCommissionsRate(double commissionsRate) {
		if(commissionsRate >= 0)
		this.commissionsRate = commissionsRate;
	}

	public double getRecValue() {
		return recValue;
	}

	public void setRecValue(double recValue) {
		if(recValue >= 0)
		this.recValue = recValue;
	}

	public int getRecID() {
		return recID;
	}

	public void setRecID(int recID) {
		if(recID >= 0)
		this.recID = recID;
	}   
    
}

