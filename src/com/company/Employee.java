package com.company;

import java.util.ArrayList;

public class Employee {

    private int empId;
    private double salaryPay;
    private int empUnionId;
    private double payRate;
    private int hours;
    private double commissionRate;
    private PaymentMethod paymentMethod = new PaymentMethod();
    private ArrayList<TimeCard> timeCards = new ArrayList<TimeCard>();
    private ArrayList<SaleReceipt> salesReceipts = new ArrayList<SaleReceipt>();
    
    //Constructors
    public Employee(int empId, double salaryPay, int empUnionId, double commissionRate){
    	this.setEmpId(empId);
    	this.setSalaryPay(salaryPay);
    	this.setEmpUnionId(empUnionId);
    	this.setCommissionRate(commissionRate);
    }
    public Employee(int empId, double payRate, int hours){
    	this.setEmpId(empId);
    	this.setPayRate(payRate);
    	this.setHours(hours);
    }
    
    //Methods
    public void storeTimeCards(ArrayList<TimeCard> timeCards){
    	this.timeCards = timeCards;
    }
    public void storeSalesReceipts(ArrayList<SaleReceipt> salesReceipts){
    	this.salesReceipts = salesReceipts;
    }
    public double hourlyPay(){
    	return payRate * hours;
    }
    public double salaryPayWithCommissions(){
    	double total;
    	total = salaryPay;
    	for(int i = 0; i < salesReceipts.size();i++){
    		total += (salesReceipts.get(i).getRecValue() * this.commissionRate);
    	}
    	return total;
    }
    
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
	public TimeCard getTimeCard(int timeCardId){
    	TimeCard cardToReturn = null;
    	for(int i = 0; i < timeCards.size(); i++)
    	{
    		if(timeCards.get(i).getTimeCardId() == timeCardId){
    			cardToReturn = timeCards.get(i);
    		}
    	}
    	return cardToReturn;
    }
	public void addTimeCard(int id, double hours, double overtime) {
		timeCards.add(new TimeCard(id,hours,overtime));
	}
	public SaleReceipt getSalesReceipt(int recId) {
		SaleReceipt receiptToReturn = null;
		for(int i = 0; i < salesReceipts.size();i++){
			if(salesReceipts.get(i).getRecId() == recId){
				receiptToReturn = salesReceipts.get(i);
			}
		}
		return receiptToReturn;
	}
	public void addSalesReceipt(int id, double value) {
		salesReceipts.add(new SaleReceipt(id, value));
	}
	public double getCommissionRate(){
		return this.commissionRate;
	}
	public void setCommissionRate(double commissionRate){
		if(commissionRate >= 0){
			this.commissionRate = commissionRate;
		}
	}
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String address, boolean isHeld) {
		this.paymentMethod = new PaymentMethod(address, isHeld);
	}
	public void setPaymentMethod(String accountNumber){
		this.paymentMethod = new PaymentMethod(accountNumber);
	}
}
