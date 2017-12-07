package com.cvb;

public class urja
{
int length,width,res;
urja(int x,int y)
{length=x;
	width=y;}
public void area()
{res=length*width;
System.out.println("area of rectangle"+" " +res);
}
public static void main(String args[])
{urja obj = new urja(20,30);
	obj.area();
}
}
