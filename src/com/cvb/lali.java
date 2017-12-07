package com.cvb;

public class lali 
{
	void fun1()
	{
		
		System.out.println("non static");
	}
	void fun2()
	{
		
		System.out.println("static");
	}

		
	public static void main(String args[])
	{
		lali obj =new lali();
		obj.fun1();
		obj.fun2();
		lali obj1 =new lali();
		obj1.fun2();
		
		
		
	}
}
