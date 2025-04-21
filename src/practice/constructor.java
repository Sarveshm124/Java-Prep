package practice;

public class constructor extends Calc {
	public void meth2()
	{
		System.out.println("this is a method");
		new constructor('w');
	}
	public constructor() //this is a constructor this will be called first
						 //we don"t need to call. it will be called whenever we are creating an object
	{
		System.out.println("this is a contructor");
		new constructor ('A');
	}
	constructor(char s)
	{
		
		System.out.println("parameterized constructor called :" +s); 
	}
	public static void main(String args[]) {
		constructor obj=new constructor();
		obj.meth2();
	}

}
