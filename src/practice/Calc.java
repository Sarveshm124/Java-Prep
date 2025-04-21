package practice;
import java.util.Scanner;

public class Calc {
	void calculation() {
		Scanner sc =new Scanner (System.in);
	System.out.println("enter your choice");
	String choice=sc.next();
	
	switch(choice) {
	
	case "Add":{
	System.out.println("enter no");
	int x=sc.nextInt();
	System.out.println("enter no");
	int y=sc.nextInt();
	System.out.println(x+y);
	break;}

	case "Sub":{
	System.out.println("enter no");
	int x=sc.nextInt();
	System.out.println("enter no");
	int y=sc.nextInt();
	System.out.println(x-y);
	break;}

	case "Mul":{
	System.out.println("enter no");
	int x=sc.nextInt();
	System.out.println("enter no");
	int y=sc.nextInt();
	System.out.println(x*y);
	break;}
	
	case "Div":{
	System.out.println("enter no");
	int x=sc.nextInt();
	System.out.println("enter no");
	int y=sc.nextInt();
	System.out.println(x/y);
	break;}
}
	sc.close();
}
}
