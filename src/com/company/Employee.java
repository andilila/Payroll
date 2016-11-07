package com.company;

public class Employee {

    private int empId;
    private double salaryPay;
    private int empUnionId;
    private double payRate;
    private int hours;
    private TimeCard timeCard = new TimeCard ();
    private SaleReceipt salesReceipt = new SaleReceipt();
    
    //Constructors
    public Employee(int empId, double salaryPay, int empUnionId, SaleReceipt salesReceipt){
    	this.setEmpId(empId);
    	this.setSalaryPay(salaryPay);
    	this.setEmpUnionId(empUnionId);
    	this.setSalesReceipt(salesReceipt);
    }
    public Employee(int empId, double payRate, int hours , TimeCard timeCard){
    	this.setEmpId(empId);
    	this.setPayRate(payRate);
    	this.setHours(hours);
    	this.setTimeCard(timeCard);
    }
    
    //Methods
    
    
    //Getters and Setters
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		if(empId >= 0)
			this.empId = empId;
	}
	public double getSalaryPay() {
		return salaryPay;
	}
	public void setSalaryPay(double salaryPay) {
		if(salaryPay >= 0)
			this.salaryPay = salaryPay;
	}
	public int getEmpUnionId() {
		return empUnionId;
	}
	public void setEmpUnionId(int empUnionId) {
		if(empUnionId >= 0)
			this.empUnionId = empUnionId;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		if(payRate >= 0)
			this.payRate = payRate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		if(hours >= 0)
			this.hours = hours;
	}
	public TimeCard getTimeCard() {
		return timeCard;
	}
	public void setTimeCard(TimeCard timeCard) {
		this.timeCard = timeCard;
	}
	public SaleReceipt getSalesReceipt() {
		return salesReceipt;
	}
	public void setSalesReceipt(SaleReceipt salesReceipt) {
		this.salesReceipt = salesReceipt;
	}
   
}
