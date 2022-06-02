package com.corejava.assignment4;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = sc.nextInt();
		System.out.println("Enter second number");
		int n2 = sc.nextInt();
		try {
			System.out.println(n1 / n2);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		System.out.println("after exception rised");
	}

}
