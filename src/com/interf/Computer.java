package com.interf;

public class Computer implements ComputerOperation , ComputerInternalOperation {


	
	
	public void ram() {
		// TODO Auto-generated method stub
		System.out.println("Computer have ram 5gB ram");
	}

	
	public void harddisk() {
		// TODO Auto-generated method stub
		System.out.println("Computer have hard disk 500GB harddisk");
	}

	
	public void processor() {
		// TODO Auto-generated method stub
		System.out.println("Computer have procssor 2.14 ghZ processor");
	}

	
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Computer have procssor 2.14 ghZ sleep");
	}

	
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Computer have procssor 2.14 ghZ start");
	}

	
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Computer have procssor 2.14 ghZ stop");
	}

	public static void main(String[] args) {
		ComputerOperation c=new Computer();
		c.Stop();
		c.start();
		ComputerInternalOperation d=new Computer();
		d.ram();
		d.processor();
	}

	
		
	}


