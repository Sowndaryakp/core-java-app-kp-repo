package com.sapient.aem.service;

import com.sapient.aem.bean.Employee;

public interface EmployeeService {
	public Employee getEmpDetails();
	public String insuranceScheme(double Salary,String designation);
	public String EmpDetails(Employee emp);
}
