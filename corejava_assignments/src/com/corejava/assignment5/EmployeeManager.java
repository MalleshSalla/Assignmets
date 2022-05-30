package com.corejava.assignment5;

import java.util.HashSet;

public class EmployeeManager {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001,"mallesh",21000,"BA");
		Employee emp2 = new Employee(1002,"shiva",21000,"HR");
		Employee emp3 = new Employee(1003,"naveen",21000,"Technical");
		Employee emp4 = new Employee(1004,"prashanth",21000,"non-Technical");
		
		HashSet<Employee> hashset = new HashSet<>();
		
		hashset.add(emp1);
		hashset.add(emp2);
		hashset.add(emp3);
		hashset.add(emp4);
		
		for (Employee employee : hashset) {
			System.out.println(employee.toString());
		}
	}
}
