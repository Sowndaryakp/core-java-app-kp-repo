package com.sapient.aem.ui;

import java.util.Scanner;

import com.cg.eis.pl.EmployeeServiceImpl;
import com.sapient.aem.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.salary, emp1.designation);
		Employee person = new Employee(emp1.Eid,emp1.name,emp1.salary,emp1.designation);
		
		//System.out.println(emp1.name);
		//emp.insuranceScheme();
		emp.EmpDetails(person);
	}
}
