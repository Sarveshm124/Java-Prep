package pjava;

import java.util.Scanner;

public class sumOfN {

	void Sumofn(int a) {
		int b=0;
		for (int i=1; i <= a; i++) {
			b = b + i;
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no");
		int No = sc.nextInt();
		new sumOfN().Sumofn(No);
		sc.close();
	}

}
