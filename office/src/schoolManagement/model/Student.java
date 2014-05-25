package schoolManagement.model;

import java.io.Serializable;

public class Student extends Person implements Serializable 
{
	private static final long serialVersionUID = -459930909411412056L;
	
	private int rollNumber;
	private int marks;

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
