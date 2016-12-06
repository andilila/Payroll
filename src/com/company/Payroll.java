package com.company;

public class Payroll {
	private Employee currentEmployee;
	private double payment;
	private String paymentMethod;
	
	public Payroll(Employee employee){
		this.currentEmployee = employee;
		if(currentEmployee.getPaymentMethod() == null)
    		this.paymentMethod = "HOLD";
    	else if(currentEmployee.getPaymentMethod().getAddress() == null)
    		this.paymentMethod = "" + currentEmployee.getPaymentMethod().getAccountNumber();
    	else
    		this.paymentMethod = currentEmployee.getPaymentMethod().getAddress();
	}
	
	public double getPayment(){
		return this.payment;
	}
	
	public void calculatePayment(){
		if(currentEmployee.getHours() == 0 && currentEmployee.salesReceiptsArray().size() == 0)
    		this.payment = currentEmployee.getSalary() / 52;
    	else if(currentEmployee.salesReceiptsArray().size() != 0)
    		this.payment = getSalaryPayWithCommissions();
    	else
    		this.payment = getHourlyPay() + getOvertimePay();
	}
	private double getOvertimePay(){
    	double overtimeHours = 0;
    	for(int index = 0; index < currentEmployee.timeCardsArray().size();index++){
    		overtimeHours += currentEmployee.timeCardsArray().get(index).getOvertimeHours();
    	}
    	   	
    	return overtimeHours * (currentEmployee.getPayRate() * 1.5);
    }
    private double getSalaryPayWithCommissions(){
    	double total;
    	total = currentEmployee.getSalary() / 52;
    	for(int index = 0; index < currentEmployee.salesReceiptsArray().size();index++){
    		total += (currentEmployee.salesReceiptsArray().get(index).getRecValue() * currentEmployee.getCommissionRate());
    	}
    	return total;
    }
    private double getHourlyPay(){
    	return currentEmployee.getPayRate() * currentEmployee.getHours();
    }
    public String getName(){
    	return currentEmployee.getName();
    }
    public String getPaymentMethod(){
    	return paymentMethod;
    }
}
