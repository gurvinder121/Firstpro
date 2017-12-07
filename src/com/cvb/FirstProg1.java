package com.cvb;

public class FirstProg1 
{



public static void main(String args[])

{   int sal=7000;
    int b;

	if (sal>=10000)

	{
	b=((sal*10)/100);
	sal=sal+b;
	}

	else
		
	{
	b=((sal*5)/100);
	sal=sal+b;
	}
	System.out.println("total sal is"+" "+sal);
}
}
