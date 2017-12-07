package com.cvb;

public class robin 
{	
int x ;
int y ;
int z ;	
	robin()
	{
		x=10;
		y=20;
		z=x+y;
		System.out.println(z);
	}
	robin(int x, int y)
	{
		this.x=x;
		this.y=y;		
	}
public static void main(String args [])
{
	robin obj1 = new robin();
	robin obj2 = new robin(3,9);
	
	
	
}

}









