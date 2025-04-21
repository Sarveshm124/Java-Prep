package pjava;

/*
Find the Sum of the Digits of a Number 
Given an input integer as the number, our objective is to break down the number into it’s individual digits 
and sum them up together. To do so we’ll use the follow two operators,

Modulo Operator % : We’ll use this to extract the digits from the number.
Divide Operator / : We’ll use it to shorten the number by 1 digit.

Once we get the digits, we sum them up one by one with each iteration.
*/

import java.util.Scanner;

public class SumOfDigits {
	static int sumOfd(int num) {
		if(num==0)
			return num;
		
		return (num % 10) + sumOfd(num/ 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a no for digits to add");
		int number = sc.nextInt();
		System.out.println("sum of digits are =>" + SumOfDigits.sumOfd(number));
		sc.close();
	}

}
