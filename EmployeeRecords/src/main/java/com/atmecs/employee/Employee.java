package com.atmecs.employee;

public class Employee {
	// public void employeeDetails() {
	private int Id;
	private String Name;
	private String Department;
	private String Designation;
	private int Salary;

	public Employee(int Id, String Name, String Designation, String Department, int Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Department = Department;
		this.Designation = Designation;
		this.Salary = Salary;

	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

public String toString() 
{ 
return this.Id+"\t"+this.Name+"\t\t"+this.Department+"\t\t\t"+this.Salary+"\t\t\t\t"+this.Designation;
}
}

