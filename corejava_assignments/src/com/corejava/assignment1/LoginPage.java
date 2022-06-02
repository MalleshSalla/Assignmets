package com.corejava.assignment1;

import java.util.Scanner;

public class LoginPage {

	public static void main(String[] args) {
		String userName = "salla mallesh";
		String _name = "salla.mallesh.com";

		String _password = "test123";

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println("Enter user name :");
			String name = sc.next();

			System.out.println("Enter the password :");
			String password = sc.next();

			if ((_name.equals(name)) && (password.equals(_password))) {
				System.out.println("welcome " + userName);
				break;
			} else {
				if (i == 3) {
					System.out.println("Contact Admin");
				} else {
					System.out.println("Sorry! try again");
				}
			}
		}

		sc.close();
	}

}
