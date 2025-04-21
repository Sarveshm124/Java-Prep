package pjava;

import java.util.Scanner;

public class evenOdd {
	void evenodd(int a) {
		if (a % 2 == 0) {
			System.out.println("no is even");
		} 
		else {
			System.out.println("no is odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a no");
		int s = sc.nextInt();
		new evenOdd().evenodd(s);
		sc.close();
	}

}
