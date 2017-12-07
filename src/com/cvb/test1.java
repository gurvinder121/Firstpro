package com.cvb;

public class test1 {

public static double solve1(double a,double b)
{
double d,n,g;

d=a;
n=b;
g=(d*d)+(n*n);
return g;
}
public static double solve2(double a,double b)
{
double g=(a*a)+(b*b);
return g;
}

	public static void main(String args[])
	{
		System.out.println(test1.solve1(1.1, 1.2));
		System.out.println(test1.solve2(1.1, 1.2));
	}
}