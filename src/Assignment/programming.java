package Assignment;
import java.util.Scanner;
public class programming {
	
	
	
	programming() {
		System.out.println("I Love Programming");
	}
	programming(String s){
		System.out.println("I Love "+ s);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 new programming();
		System.out.println("tyoe a word");
		String s=sc.next();
		new programming(s);
		sc.close();
	}
}
