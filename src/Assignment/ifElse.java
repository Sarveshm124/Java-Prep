package Assignment;

import java.util.Scanner;

public class ifElse {
	//program for comaparing 2 no
	public void meth1 (int a , int b)
	{
		if(a>b) 
			System.out.println("a is greter than b");
		else if(a<b)
		System.out.println("a is less than b");
		else 
			System.out.println("a is less than b");
		
	}
	
	
	//program for comparing 3 no
	
	void meth2 (int a , int b , int c)
	{
		if(a>b) {
			if(a>c)
				System.out.println("1st is greter no");
			else 
				System.out.println("3rd is greter no");
			}
		else {
			if(b>c) 
				System.out.println("2nd is greter no");
			else 
				System.out.println("3rd is greter no");
	
		}
	}
	
	
	public void meth3(int Length, int Breadth)
	{
		if (Length == Breadth) 
			System.out.println("this is a square");
		else
			System.out.println("not a square");
	}
	
	
	
	//program for discount on purchase
	
	void meth4(int quantity) {
		int price=100*quantity;
		if (price>1000) {
			price=(price*10)/100;
			System.out.println("you purchased more than 100 rs of item \n so after cutting your 10% your payable amount is: "+price);
		}
		else {
			System.out.println("your payable amount is: " +price);
		}
	}
	

	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ifElse obj=new ifElse();
	
	
	//obj.meth1(50,60);
	
	
	/*System.out.println("type 1st no");
	int e= sc.nextInt();
	System.out.println("type 2nd no");
	int f= sc.nextInt();
	System.out.println("type 3rd no");
	int g= sc.nextInt();
	obj.meth2(e, f, g);
	*/
	
	
	/*
	System.out.println("type length");
	int l= sc.nextInt();
	System.out.println("type breadth");
	int b= sc.nextInt();System.out.println("type 1st no");
	obj.meth3(l,b);
	*/
	
	

	System.out.println("what is quantity you purchased");
	int quantity=sc.nextInt();
	obj.meth4(quantity);
	
	
	
	sc.close();
}
}
