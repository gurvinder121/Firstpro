package com.cvb;

public class overload {
	
		static int x;
		int y;
		int z;
		
		overload()
		{x=101;
		y=109;
			System.out.println(x+y);
		}
		
	overload(int x, int y)

	{
	this.x=x;
	this.y=y;
	z=x+y;
	
	System.out.println(z);
	}
	overload(int m, int n, int o)

	{
	this.x=m;
	this.y=n;
	this.z=o;
	System.out.println(x+y+z);
	}
	public static void main(String args[])
	{
	overload m =new overload();
	overload n =new overload(3,4);
	System.out.println(n.x);
	overload o =new overload(3,4,5);
	System.out.println(x);

		
	}
	}


