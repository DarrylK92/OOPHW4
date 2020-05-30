/*
	This program retrieves course information from a user and displays information about the entered course.
	
	Author: Darryl Karney
	Course: CPSC24500
 */

package oophw4;

import java.util.Scanner;

public class UseCourse {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		//Get department info from user
		System.out.print("Please enter a department: ");
		String department;
		department = kb.next().toUpperCase();
		
		//Get courseNumber info from user
		int courseNumber = 0;
		boolean validCourseNumber = false;
		while(!validCourseNumber) {
			System.out.print("Please enter a course number: ");
			try {
				courseNumber = kb.nextInt();
				validCourseNumber = true;
			} catch(Exception e) {
				kb.next();
				System.out.println("Invalid course number entered!");
			}
		}
		
		//Get credits info from user
		int credits = 0;
		boolean validCredits = false;
		while(!validCredits) {
			System.out.print("Please enter the amount of credit hours: ");
			try {
				credits = kb.nextInt();
				validCredits = true;
			} catch(Exception e) {
				kb.next();
				System.out.println("Invalid credits entered!");
			}
		}
		
		//Create LabCourse if department is BIO, CHM, CIS or PHY
		if (department.equals("BIO") || department.equals("CHM") ||
				department.equals("CIS") || department.equals("PHY")) {
			LabCourse labCourse = new LabCourse(department, courseNumber, credits);
			System.out.println(labCourse);
		} else { //Otherwise, create a collegeCourse
			CollegeCourse collegeCourse = new CollegeCourse(department, courseNumber, credits);
			System.out.println(collegeCourse);
		}
	}

}
