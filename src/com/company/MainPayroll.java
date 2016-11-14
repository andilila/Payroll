package com.company;

import java.awt.List;
import java.util.ArrayList;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class MainPayroll {

	static ArrayList<Employee> empList = new ArrayList<Employee>();

	public static void main(String args[]) {
		
		SaleReceipt sr = new SaleReceipt();
		sr.recID = 151;
		sr.recValue = 1551;
		
		TimeCard tr = new TimeCard();
		tr.hoursPerDay = 8;
		tr.overtimeHours = 2;

		empList.add(new Employee(1, 1.1, 101, sr));
		empList.add(new Employee(2, 1.2, 40, tr));
		empList.add(new Employee(3, 1.3, 102, sr));
		empList.add(new Employee(4, 1.4, 44, tr));

		for (int i = 0; i < empList.size(); i++) {
			
			System.out.println("Member ID: " + empList.get(i).getEmpId() + "\tSalary Pay: "
					+ empList.get(i).getSalaryPay() + "\tUnion ID: " + empList.get(i).getEmpUnionId() + "\tPay Rate: "
					+ empList.get(i).getPayRate() + "\tHours: " + empList.get(i).getHours() + "\tSales Receipt ID: "
					+ empList.get(i).getSalesReceipt().recID + "\tSales Receipt Value: "
					+ empList.get(i).getSalesReceipt().recValue + "\tTime Card Hours per Day: "
					+ empList.get(i).getTimeCard().hoursPerDay + "\tTime Card Overtime Hours: "
					+ empList.get(i).getTimeCard().overtimeHours);

		}

	}
}
