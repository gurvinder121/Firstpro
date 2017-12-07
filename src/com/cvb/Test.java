package com.cvb;

public class Test {
	double x,y,z;
	public void add(double x , double y )
	{
	
		z=x+y;
	System.out.println(z);
		
	}
	public static double var(double x, double y, double z)
	{
	double c=x*y*z;
	return c;	
	}
	
	public static void main(String args[])
	{
	Test obj=new Test();
    obj.add(5.5,9.8);
    
    System.out.println(obj.var(1.2,3.4,5.6));
    
    System.out.println(Test.var(1.2,3.4,5.6));
	}
	

}
