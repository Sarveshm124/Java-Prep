package Assignment;

import java.util.Scanner;

public class forLoop {
 void meth1()
 {Scanner sc =new Scanner(System.in);

// for(int i=0;i>0; ) {
//		 a=a+i;
////		 System.out.println(b);
//		 }
 int a=0;
 int sum=0;
 int c=0;
 do { a=sc.nextInt();
	sum=sum+a;
	c++;
	
 }while(a>0);
 System.out.println(sum);
 System.out.println(c);
// System.out.println(a);
	 sc.close();
}
public static void main(String[] args) {
	forLoop obj=new forLoop();
	obj.meth1();
	
}

}
