package com.corejava.assignment5;

public class Employee {

	int id;
	String name;
	double salary;
	String department;

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void displayDetails() {
		System.out.println("Employee id is : " + id);
		System.out.println("Employee name is :" + name);
		System.out.println("Employee salary :" + salary);
		System.out.println("Employee department is :" + department);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}
