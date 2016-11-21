package com.company;

import java.awt.List;
import java.util.ArrayList;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class MainPayroll {

	static ArrayList<Employee> empList = new ArrayList<Employee>();

	public static void main(String args[]) {
		
		
		
		empList.add(new Employee(1,"Victor", 1.1, 101, 0.8));
		empList.add(new Employee(2,"Michael", 1.2, 40));
		empList.add(new Employee(3,"Ben", 1.3, 102, 0.4));
		empList.add(new Employee(4,"Andi", 1.4, 44));

		empList.get(0).addSalesReceipt(1, 1234);
		empList.get(0).addSalesReceipt(2, 4321);
		empList.get(0).addTimeCard(1, 3, 0);
		empList.get(0).addTimeCard(2, 3, 0);
		empList.get(0).setPaymentMethod(999999);
		empList.get(1).addTimeCard(1, 3, 0);
		empList.get(1).addTimeCard(2, 3, 0);
		empList.get(1).addSalesReceipt(1, 1234);
		empList.get(1).addSalesReceipt(2, 4321);
		empList.get(1).setCommissionRate(1.5);
		empList.get(1).setPaymentMethod("50 South 100 West", false);
		empList.get(2).addTimeCard(1, 7, 2);
		empList.get(2).addTimeCard(2, 7, 2);
		empList.get(2).addSalesReceipt(1, 1234);
		empList.get(2).addSalesReceipt(2, 4321);
		empList.get(2).setPaymentMethod("30 South 300 West", true);
		empList.get(3).addTimeCard(1, 7, 2);
		empList.get(3).addTimeCard(2, 7, 2);
		
		
		PayToFile p = new PayToFile();
		
		p.writeToFile(empList);
		
/*		for (int i = 0; i < empList.size(); i++) {
			
			System.out.println("Member ID: " + empList.get(i).getEmpId() + "\tSalary Pay: "
					+ empList.get(i).getSalaryPay() + "\tUnion ID: " + empList.get(i).getEmpUnionId() + "\tPay Rate: "
					+ empList.get(i).getPayRate() + "\tHours: " + empList.get(i).getHours() + "\tSales Receipt ID: "
					+ empList.get(i).getSalesReceipt(1).getRecId() + "\tSales Receipt Value: "
					+ empList.get(i).getSalesReceipt(1).getRecValue() + "\tTime Card Hours per Day: "
					+ empList.get(i).getTimeCard(1).getHoursPerDay() + "\tTime Card Overtime Hours: "
					+ empList.get(i).getTimeCard(1).getOvertimeHours());

		}*/
		
		

	}
}
