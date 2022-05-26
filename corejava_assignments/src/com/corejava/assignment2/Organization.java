package com.corejava.assignment2;

public class Organization {
	public static void main(String[] args) {
		Labour lbr=new Labour("shiva",15000,"Labour");
		Manager mgr=new Manager("Mallesh",30000,"Manager");
		
		mgr.calculateSalary();
		
		lbr.calculateSalary();
	}
}

