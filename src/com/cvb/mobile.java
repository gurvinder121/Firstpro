package com.cvb;

public class mobile {
	String a, b;
	
public void add(String x,String y)
{
a=x;
b=y;
System.out.println(a+" "+b);

}
public static void main(String args[])
{
mobile obj=new mobile();	
obj.add("hello" , "world");

}
}
