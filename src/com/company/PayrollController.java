package com.company;

import java.util.ArrayList;

/**
 * Created by Andi Lila on 10/31/2016.
 */
public class PayrollController {
	private static ArrayList<Employee> empList = new ArrayList<Employee>();
	private static ArrayList<Payroll> payroll = new ArrayList<Payroll>();
	
	public static void addEmployee(int id, String name, double salary, int empUnionId, double commissionRate){
		empList.add(new Employee(id, name, salary, empUnionId, commissionRate));
	}
	public static void addEmployee(int id, String name,  double payRate, int hours){
		empList.add(new Employee(id, name, payRate, hours));
	}
	public static void addEmployee(int id, String name, double salary, double commissionRate){
		empList.add(new Employee(id, name, salary, commissionRate));
	}
	public static void removeEmployee(int id){
		for(int i = 0; i < empList.size(); i++){
			if(empList.get(i).getEmpId() == id)
				empList.remove(i);
		}
	}
	public static void removeEmployee(String name){
		for(int i = 0; i < empList.size(); i++){
			if(empList.get(i).getName().equalsIgnoreCase(name))
				empList.remove(i);
		}
	}
	public static Employee getEmployee(int id){
		for(int i = 0; i < empList.size(); i++){
			if(empList.get(i).getEmpId() == id){
				return empList.get(i);
			}
		}
		return null;
	}
	public static Employee getEmployee(String name){
		for(int i = 0; i < empList.size(); i++){
			if(empList.get(i).getName().equalsIgnoreCase(name))
				return empList.get(i);
		}
		return null;
	}
	public static void addNewEmployeeList(ArrayList<Employee> list){
		empList = list;
	}
	public static void clearEmployeeList(){
		empList.clear();
	}
	public static void editEmployee(Employee employee){
		for(int i = 0; i < empList.size(); i++)
			if(empList.get(i).getEmpId() == employee.getEmpId())
				empList.set(i, employee);
	}
	public static ArrayList<Employee> getEmployeeList(){
		return empList;
	}
	public static void buildPayroll(){
		for(int i = 0; i < empList.size();i++){
			payroll.clear();
			Payroll temp = new Payroll(empList.get(i));
			temp.calculatePayment();
			payroll.add(temp);
		}
	}
	public static ArrayList<Payroll> getPayroll(){
		return payroll;
	}
}
