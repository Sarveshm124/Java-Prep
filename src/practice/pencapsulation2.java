package practice;

import java.util.Scanner;

public class pencapsulation2 {
	Scanner sc= new Scanner(System.in);
 void meth1(){
	 pencapsulation obj=new pencapsulation();
	 
	 System.out.println("enter the name");
	 obj.setName(sc.next());
	 
	 System.out.println("enter your id");
	 obj.setId(sc.nextInt());
	 
	 System.out.println("enter your Adress");
	 obj.setAddrase(sc.next());
	 
	 
	 System.out.println("name: "+obj.getName());
	 System.out.println("name: "+obj.getId());
	 System.out.println("name: "+obj.getAddrase());
 }
 public static void main(String[] args) {
	 pencapsulation2 obj1=new pencapsulation2();
	 obj1.meth1();
	 
	 
	 
}
}
