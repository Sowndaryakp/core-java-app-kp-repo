package com.cg.eis.pl;

import java.util.Scanner;

import com.sapient.aem.bean.Employee;
import com.sapient.aem.service.EmployeeService;

public abstract class EmployeeServiceImpl implements EmployeeService {
	@Override
	public Employee getEmpDetails() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter employee id");
		in.nextInt();
		System.out.println("Enter employee name");
		in.next();
		System.out.println("Enter employee salary");
		in.nextDouble();
		return null;
		
	}

	@Override
	public String EmpDetails(Employee emp) {
		System.out.println("Employee id"+emp.Eid);
		System.out.println("Employee name"+emp.name);
		System.out.println("Employee designation"+emp.designation);
		System.out.println("Employee salary"+emp.salary);
//		System.out.println("Employee insurancescheme"+emp.insuranceScheme);
		return null;
		
		
	}

}
