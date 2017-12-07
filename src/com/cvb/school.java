package com.cvb;

public class school {

	public static void main(String args[]) {
		int marks = 56;
		String grade="";

		if (marks >= 85) {
			grade = "A";
		}

		else if (marks >= 75) {
			grade = "B";
		}

		else if (marks >= 65) {
			grade = "C";
		}

		else if (marks < 65) {
			grade = "D";
		}
		System.out.println("grade is" + grade);
	}

}