package com.cvb;

public class tablet {
	
	tablet(int x)
	{
	System.out.println("square");
	}
	tablet()
	{
	System.out.println("null");
	}
	tablet(int x, double y)
	{
		
		System.out.println("diff nos");
	}
		public static void main(String args[])
		{
		tablet x1 =new tablet(5);
		tablet x2 =new tablet();
		tablet x3 =new tablet(5,3.76);
		}
}
