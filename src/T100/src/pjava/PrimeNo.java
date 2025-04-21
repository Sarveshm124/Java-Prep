package pjava;

import java.util.Scanner;

public class PrimeNo {
void prime() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a no to chech whether it is prime or not");
	int no=sc.nextInt();
	if(isPrime(no)) {
		System.out.println("is prime");
	}
	else {
		System.out.println("not prime");
	}
	sc.close();
}
boolean isPrime(int i) {
	if(i<2) {
		return false;
	}
	for (int y=2;y<=Math.sqrt(i);y++){
		if(i%y==0) {
			return false;
		}
	}
		return true;
	
}
	public static void main(String[] args) {
		
new PrimeNo().prime();
	}

}
