package com.inherit;

public class Child extends Parent {
	
	public void eat() //method overriding
	{
		System.out.println("Now child eating piga");
	}
	
	public void drink() {
		
		
		System.out.println("Now child is drinking cold drink");
	}	
		
	
	public static void main(String [] args)
	{
		
		Parent p=new Parent();
		Child c=new Child();
		c.eat();
		p.eat();
		p.drink();
		c.drink();
		System.out.println(Parent.div(10,300));
		System.out.println(p.div(10,300));
		
		
	
		
	}

}
