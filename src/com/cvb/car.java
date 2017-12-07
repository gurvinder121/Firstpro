package com.cvb;

public class car {
	int x;
	int y;
	int z;
	
	car()
	{
		System.out.println("static");
	}
	
car(int x, int y, int z)

{
this.x=x;
this.y=y;
this.z=z;
System.out.println(x+" "+y +" "+z);
}
public static void main(String args[])
{
car m =new car();
car n =new car(3,4,5);

	
}
}


