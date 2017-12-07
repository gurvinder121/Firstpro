package com.vehicle;

public class SuvParts implements brandprice , brabdfeaturespecial {

	public void ferrari() {
		System.out.println("price starts at 2 crore");
	}

	public void bmw() {
		System.out.println("price starts at 50 lakhs");
	}

	public void mercedes() {
		System.out.println("price starts at 25 lakhs");
	}

	public void airbags() {
		System.out.println("protects at the time of accidents");
	}

	public void bulletproof() {
		System.out.println("no effect of bullets");
	}

	public void heavydutyengine() {
		System.out.println("more than 10000 cc engines");
	}

	public void tyre1(int a) {
		System.out.println("tyre1");

	}

	public static int tyre(int a) {
		int f = a;
		return f;

	}

	public static void main(String args[]) {
		brandprice a = new SuvParts();
		a.bmw();
		a.ferrari();
		brabdfeaturespecial b = new SuvParts();
		b.airbags();
		b.heavydutyengine();
		b.tyre1(6);
		System.out.println(brabdfeaturespecial.tyre(101));

	}

}
