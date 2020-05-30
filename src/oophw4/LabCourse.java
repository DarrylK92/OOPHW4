package oophw4;

public class LabCourse extends CollegeCourse {
	//Constructor
	public LabCourse(String department, int courseNumber, int credits) {
		super(department, courseNumber, credits);
	}
	
	
	/**
	 * @param credits the credits to set
	 */
	@Override
	protected void setFee(double fee) {
		super.setFee(fee + 50);
	}
	
	//Displays all information for this LabCourse
	@Override
	public String toString() {
		return "******************************" +
				"\nThis is a lab course!\n" +
				super.toString();
	}
}
