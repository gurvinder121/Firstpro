package com.cvb;

public class english {

	public void nonstatic(int c)
	{   
		for (int b=c; b<=2; b++)
		{
			System.out.println("hello");
		}	
		
		
	}
	
	
	
	public static void main(String args[])
	
	{		for (int a=1 ; a<=2; a++)
		{
			System.out.println("hello");
		}
	english obj=new english();
	obj.nonstatic(1);
		}
}
