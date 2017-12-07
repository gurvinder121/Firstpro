package com.cvb;

public class greaterless {

	public void exp(int x) {
		if (x == 10)

		{
			System.out.println("no is ten");
		}

		else if (x < 10) {
			System.out.println("no is less than ten");
		}

		else if (x > 10) {
			System.out.println("no is more than ten");
		}

	}

	public static void main(String args[]) {

		greaterless obj = new greaterless();
		obj.exp(5);
	}
}
