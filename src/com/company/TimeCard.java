package com.company;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class TimeCard {

	private int timeCardId;
    private double hoursPerDay;
    private double overtimeHours;
    
    public TimeCard(int timeCardId, double hoursPerDay, double overtimeHours){
    	this.setHoursPerDay(hoursPerDay);
    	this.setOvertimeHours(overtimeHours);
    	this.setTimeCardId(timeCardId);
    }

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		if(overtimeHours >= 0)
			this.overtimeHours = overtimeHours;
	}

	public double getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(double hoursPerDay) {
		if(overtimeHours >= 0)
			this.hoursPerDay = hoursPerDay;
	}

	public int getTimeCardId() {
		return timeCardId;
	}

	public void setTimeCardId(int timeCardId) {
		this.timeCardId = timeCardId;
	}
    

}
