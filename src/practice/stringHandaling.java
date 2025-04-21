package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringHandaling {
	Scanner sc = new Scanner(System.in);

	String assignment1() {
		System.out.println("type name");
		return sc.next();
	}
	
	String assignment2()
	{
		System.out.println("enter out");
		String a=sc.next();
		System.out.println("enter the word");
		String b=sc.next();
		return a.substring(0,2)+b.concat(a.substring(2));
	}
	
	String assignment3() {
		System.out.println("enter the first word");
		String a=sc.next();
	String b="";
		for(int i=a.length()-1;i>=0;i--) {
			 b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b)) {
			return "it is a pelendrom";}
		else {
		return " it is not a pelendrom";
		}
	}
	
	void assignment4()
	{
		System.out.println("give a string of min length 2");
		String word=sc.next();
		if(word.length()>3) {
			String s=word.substring(word.length()-2);
		System.out.println(s+s+s);}
		else {
			System.out.println("enter vald string");
		}
	}

	
	void assignment5()
	{
		System.out.println("give a string of min length 2");
		String word=sc.next();
		if(word.length()>3) {
			String s=word.substring(0,word.length()/2);
		System.out.println(s);}
		else {
			System.out.println("enter vald string");
		}
	}
	
	void assignment6()
	{
		System.out.println("enter string");
		String a=sc.next();
		String b="";
		 {
			
		}
	}
	
	
	public static void main(String[] args) {
//		String s="java";
//		String s1=new String ("Java");
//		System.out.println(s.concat("is awasom"));
//		System.out.println("java".equals(s1));
//		System.out.println("java".equalsIgnoreCase(s1));

		stringHandaling obj = new stringHandaling();

//		System.out.println("hello " +obj.assignment1());
		
//		System.out.println( obj.assignment2());
		
//	System.out.println( obj.assignment3());
//		obj.assignment4();
//		obj.assignment5();
		
		obj.sc.close();
	}
}
