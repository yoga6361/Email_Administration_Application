package com.yoga.reddy;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
//		to get first and last name
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first name :");
		String firstname = sc.nextLine();
		System.out.print("Enter last name :");
		String lastname = sc.nextLine();
//		calling constructor
		Email em1 = new Email(firstname, lastname);
		em1.SetalternateEmail("JS@gmail.com");
		System.out.println(em1.showInfo());

	}

}
