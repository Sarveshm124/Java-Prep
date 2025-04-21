package pjava;

import java.util.Scanner;

public class PositiveNegative {
	void positiveNegative(int a) {
		if (a == 0) {
			System.out.println("no is zero");
		} else {
			System.out.println((a > 0) ? "no is positive" : "no is negative");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int x = sc.nextInt();
		new PositiveNegative().positiveNegative(x);
		sc.close();
	}

}
