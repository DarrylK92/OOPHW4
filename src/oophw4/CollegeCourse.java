package oophw4;

import java.text.DecimalFormat;

public class CollegeCourse {
	//Member variables
	private String department;
	private int courseNumber;
	private int credits;
	private double fee;
	static DecimalFormat mydf = new DecimalFormat("000.00");
	
	//Constructor
	public CollegeCourse(String department, int courseNumber, int credits) {
		this.department = department;
		this.courseNumber = courseNumber;
		setCredits(credits);
	}
	
	//Displays all information for this CollegeCourse
	@Override
	public String toString() {
		return "******************************" +
				"\nContents of: " + super.toString() +
				"\nDepartment: " + getDepartment() +
				"\nCourse number: " + getCourseNumber() +
				"\nCredits: " + getCredits() +
				"\nFee: $" + mydf.format(getFee()) +
				"\n******************************";
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the courseNumber
	 */
	public int getCourseNumber() {
		return courseNumber;
	}

	/**
	 * @param courseNumber the courseNumber to set
	 */
	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	/**
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}

	/**
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
		
		setFee(credits * 120.0);
	}

	/**
	 * @return the fee
	 */
	public double getFee() {
		return fee;
	}

	/**
	 * @param fee the fee to set
	 */
	protected void setFee(double fee) {
		this.fee = fee;
	}
}
