package com.sapient.aem.bean;

public class Employee {
	public int Eid;
	public String name;
	public double salary;
	public String designation;
	
	
	public Employee() {
		
	}

	public Employee(int eid, String name, double salary, String designation) {
		super();
		Eid = eid;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		Eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

	

	
	
}
