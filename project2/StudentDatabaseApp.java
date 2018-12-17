package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		// Ask how many new students we want to add
		System.out.println("Enter number of new Students to enroll:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		// import new scanner here(creating a new array of objects(students)
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];

		// Create a number of new students
		for (int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for (int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());

			// for (int n = 0; n < numOfStudents; n++) {
			// students[n] = new Student();
			// students[n].enroll();
			// students[n].payTuition();
			// System.out.println(students[n].toString());
			// bring sysout here and can do more than 1 student information like this
			// System.out.println(students[0].toString());
			// System.out.println(students[1].toString());
          // System.out.println(students[2].toString());	     
		}
	}

}
