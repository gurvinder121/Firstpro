package com.cvb;

public class AddMethod {
	
int a,b;

AddMethod(int a , int b)
{
	this.a=a;
	this.b=b;
	System.out.println("2 variables");
}
	
AddMethod()
{
	System.out.println("0 variables");
}	
	public static void main (String args[])

	{
	AddMethod obj = new AddMethod();
	
	AddMethod nm = new AddMethod(3,7);
		
	}}

