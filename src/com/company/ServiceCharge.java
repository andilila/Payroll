package com.company;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class ServiceCharge {

    private int employeeUnionID;
    private int unionId;
    private double chargeValue;
    
    public ServiceCharge(int unionId, int employeeUnionID, double chargeValue){
    	this.setUnionId(unionId);
    	this.setChargeValue(chargeValue);
    	this.setEmployeeUnionID(employeeUnionID);
    }

	public int getEmployeeUnionID() {
		return employeeUnionID;
	}

	public void setEmployeeUnionID(int employeeUnionID) {
		if(employeeUnionID >= 0)
			this.employeeUnionID = employeeUnionID;
	}

	public int getUnionId() {
		return unionId;
	}

	public void setUnionId(int unionId) {
		if(unionId >= 0)
			this.unionId = unionId;
	}

	public double getChargeValue() {
		return chargeValue;
	}

	public void setChargeValue(double chargeValue) {
		if(chargeValue >= 0)
			this.chargeValue = chargeValue;
	}

}
