package com.corejava.assignment6;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.Comparator;

public class Collection3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001, "naveen", "HR", 25000);
		Employee emp2 = new Employee(1002, "srinu", "IT", 20000);
		Employee emp3 = new Employee(1003, "bunny", "Civil", 45000);
		Employee emp4 = new Employee(1004, "charan", "Manager", 95000);
		Employee emp5 = new Employee(1005, "madhav", "TD", 35000);
		Employee emp6 = new Employee(1006, "malik", "ANALYST", 37000);
		Employee emp7 = new Employee(1007, "tillu", "TS", 81000);
		Employee emp8 = new Employee(1008, "suresh", "HR", 39000);
		Employee emp9 = new Employee(1009, "ganesh", "TL", 80000);
		Employee emp10 = new Employee(1010, "shiva", "HR", 23000);

		TreeSet<Employee> treeSet = new TreeSet<Employee>(new MyNameComp());
		treeSet.add(emp1);
		treeSet.add(emp2);
		treeSet.add(emp3);
		treeSet.add(emp4);
		treeSet.add(emp5);
		treeSet.add(emp6);
		treeSet.add(emp7);
		treeSet.add(emp8);
		treeSet.add(emp9);
		treeSet.add(emp10);
		
		Iterator<Employee> itr = treeSet.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		TreeSet<Employee> treeSet1 = new TreeSet<Employee>(new MyIdComp());
		treeSet1.add(emp1);
		treeSet1.add(emp2);
		treeSet1.add(emp3);
		treeSet1.add(emp4);
		treeSet1.add(emp5);
		treeSet1.add(emp6);
		treeSet1.add(emp7);
		treeSet1.add(emp8);
		treeSet1.add(emp9);
		treeSet1.add(emp10);
		Iterator<Employee> itr1 = treeSet1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}
}


 class MyNameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
	
}

class MyIdComp implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if (e2.getSalary() > e1.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
