package com.yoga.reddy;

import java.util.Scanner;

public class Email {
// initializing variables 
	private String firstName;
	private String lastName;
	private String company = "xyz.com";
	private String password;
	private String Department;
	private int mailBoxCapacity = 100;
	private String alternateEmail;
	private String email;
	private int length = 10;

//	constructor to call all the methods.
	Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for:" + this.firstName + " " + this.lastName);

		// call Department inside constructor using "this"
		this.Department = setDepartment();
//		System.out.println("Department:"+this.Department);
		// call Department inside constructor using "this"
		this.password = randPassword(length);
//		System.out.println("Password is:"+this.password);
		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "." + Department + "." + company;
//		System.out.println("your mail is "+ email);
	}

//	Ask for Department 
	@SuppressWarnings("resource")
	private String setDepartment() {
		System.out.println("Enter the department\n1 for Sale\n2 for Development\n3 for Accounting\n0 for none ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		} else if (depChoice == 2) {
			return "Development";
		} else if (depChoice == 3) {
			return "Account";
		} else {
			return "None";
		}
	}

// Generating Random password 
	private String randPassword(int length) {
		String Setpass = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi" + "jklmnopqrstuvwxyz!@#$%&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * Setpass.length());
			password[i] = Setpass.charAt(rand);
		}
		return new String(password);
	}

//	set the mailbox capacity
	public void SetmailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}

//	set the alternate email
	public void SetalternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	public int getmailBoxcapacity() {
		return mailBoxCapacity;
	}

	public String getalternateEmail() {
		return alternateEmail;
	}

	public String password() {
		return password;
	}

	public String showInfo() {
		return "Display Name:" + firstName + " " + lastName + "\n" + "Company Email:" + email + "\n" + "Password:"
				+ password + "\n" + "Mailbox Capacity:" + mailBoxCapacity + "mb";
	}
}
