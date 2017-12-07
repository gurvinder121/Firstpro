package com.cvb;

public class laptop {
	double a,b,c;
	laptop()
	{a=10.5;
	b=20.5;
	c=41.0;}
	public void add()
	{
	System.out.println(a+c);
	}
	public void div()
	{
    System.out.println(c/b);
	}
	public static void main(String args[])
	{
		laptop obj1 =new laptop();
		obj1.add();
		obj1.div();
	}}
