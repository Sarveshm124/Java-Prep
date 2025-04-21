package pjava;

import java.util.Scanner;

/*
Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval 
using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number.

*/

public class AddNNo {
	static int sumOfNo(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give first no");
		int first = sc.nextInt();
		System.out.println("give second no");
		int second = sc.nextInt();
		System.out.println("sum of no between first and second is => " + AddNNo.sumOfNo(first, second));
		sc.close();
	}

}
