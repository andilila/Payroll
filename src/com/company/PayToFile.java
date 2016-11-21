package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;

import com.company.Employee;

public class PayToFile {

	public static void writeToFile(ArrayList<Employee> empList) {

		Date date = new Date();
		String fileName1;
		String fileName2;
		String fileName3;
		ArrayList<Employee> empList1 = new ArrayList<Employee>();
		ArrayList<Employee> empList2 = new ArrayList<Employee>();
		ArrayList<Employee> empList3 = new ArrayList<Employee>();

		for (int i = 0; i < empList.size(); i++) {
			Employee temp = empList.get(i);

			System.out.println("Name: " + empList.get(i).getName());

			if (temp.getPaymentMethod().getAddress() != null) {
				empList1.add(temp);
			}
			// } else {
			if (temp.getPaymentMethod().getAccountNumber() > 0) {
				empList2.add(temp);
			}
			// } else {
			if (temp.getPaymentMethod().getAccountNumber() == 0 && temp.getPaymentMethod().getAddress() == null) {
				empList3.add(temp);
			}

		}

		// The name of the file to open.
		fileName1 = date.toString().replace(':', '-') + " - payMail.csv";
		// The name of the file to open.
		fileName2 = date.toString().replace(':', '-') + " - payDD.csv";
		// The name of the file to open.
		fileName3 = date.toString().replace(':', '-') + " - payHold.csv";

		if (empList1.size() > 0) {
			payMail(empList1, fileName1);
		}
		if (empList2.size() > 0) {
			payDD(empList2, fileName2);
		}
		if (empList3.size() > 0) {
			payHold(empList3, fileName3);
		}

	}

	public static void payDD(ArrayList<Employee> empList1, String fileName) {

		String line = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			// FileWriter writes text files in the default encoding.
			fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < empList1.size(); i++) {
				Employee temp = empList1.get(i);

				line = temp.getName() + ',' + temp.getAmmountPaid() + ',' + temp.getEmpId() + ','
						+ temp.getPaymentMethod().getAccountNumber()+'\n';
				bufferedWriter.write(line);

			}

			// Always close files.
			bufferedWriter.close();

		} catch (Exception e) {

		}

	}

	public static void payMail(ArrayList<Employee> empList2, String fileName) {

		String line = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			// FileWriter writes text files in the default encoding.
			fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < empList2.size(); i++) {
				Employee temp = empList2.get(i);

				line = temp.getName() + ',' + temp.getAmmountPaid() + ',' + temp.getEmpId() + ','
						+ temp.getPaymentMethod().getAddress()+'\n';
				bufferedWriter.write(line);

			}

			// Always close files.
			bufferedWriter.close();

		} catch (Exception e) {

		}
	}

	public static void payHold(ArrayList<Employee> empList3, String fileName) {

		String line = null;
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			// FileWriter writes text files in the default encoding.
			fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < empList3.size(); i++) {
				Employee temp = empList3.get(i);

					line = temp.getName() + ',' + temp.getAmmountPaid() + ',' + temp.getEmpId()+'\n';
					bufferedWriter.write(line);
				
			}
			// Always close files.
			bufferedWriter.close();

		} catch (Exception e) {
			
		}

	}

}
