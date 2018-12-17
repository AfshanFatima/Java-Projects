package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	// using encapsulation will be private
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// student class will be our outline and the comments are our methods

	// constructor : prompt user to enter Student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Student first name:");
		this.firstName = in.nextLine();

		System.out.println("Enter Student last name:");
		this.lastName = in.nextLine();

		System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\4 - Senior\nEnter student class level:");
		this.gradeYear = in.nextInt();

		setStudentID();
		//we don need to see this initial print in output 
		//System.out.println(firstName + " " + lastName + gradeYear + " " + studentID);

	}

	// Generate an ID
	private void setStudentID() {
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				// always use .equals for strings
				courses = courses + "\n  " + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			} else {
				// System.out.println("BREAK!");
				break;
			}
		} while (1 != 0);

		// System.out.println("ENROLLED IN: " + courses);
		// System.out.println("TUITION BALANCE: " + tuitionBalance);
	}

	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}

	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your  payment of $" + payment);
		viewBalance();
	}

	// Show Status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade level:" + gradeYear +
				"\nStudent ID:" + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
}
