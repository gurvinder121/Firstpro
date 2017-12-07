package com.cvb;

public class comp {
	int a,b;
	comp()
	{
		System.out.println("default");	
	}
	comp(int x)
	{
	a=x;
	
	System.out.println("square is "+(a*a));
	}
	comp(int x, int y)
	{
		a=x;
		b=y;
		System.out.println("addition is"+" " +(a+b));
	}
		public static void main(String args[])
		{
		comp obj1 =new comp(45);
		comp obj2 =new comp(10,30);
			
		}
	}
	


