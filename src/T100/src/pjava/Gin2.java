package pjava;

import java.util.Scanner;

public class Gin2 {
void greatestIn2(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no.");
	int first=sc.nextInt();
	System.out.println("Enter Second no.");
	int second=sc.nextInt();
	if(first>second)
		System.out.println("first no is greater than second");
	else if(first<second)
		System.out.println("second is the greter no");
	else 
		System.out.println("both no is equal");
	sc.close();
}
	public static void main(String[] args) {
		
new Gin2().greatestIn2();

	}

}
