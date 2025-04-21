package pjava;

/*
 Check Whether or Not the Number is a Palindrome in Java
Given an integer input as the number, the objective is to check whether or not the given number is a palindrome. 
To do so, we’ll first reverse the string input using loops and recursion and check if it matches the original number.
*/



public class PelindromNo {

	public static void main(String[] args) {
		int num =123;
		int onum=num;
		int rnum=0;
		while(num!=0) {
	int lno=num%10; //last no
	System.out.println("num is "+num);
		rnum=rnum*10+lno; //rivrs no
		System.out.println("r num "+rnum);
		num/=10;
		
		}
		
		if (onum == rnum) {
			System.out.println("no is pelendrom");
		}
		else {
			System.out.println("not a palendrom");
		}
	}

}
