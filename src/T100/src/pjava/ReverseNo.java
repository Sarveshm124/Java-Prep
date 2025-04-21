package pjava;

/*
Find the Reverse of a Number in Java
Given a integer input the objective is to break down the  number into digits and rearrange them in reverse order.
*/

public class ReverseNo {
	
	  static int r(int number) {
		  
		  int reversed = 0;
		  while (number != 0) {
	            int digit = number % 10; // Extract last digit
	            reversed = reversed * 10 + digit; // Build reversed number
	            number /= 10; // Remove last digit
	        }
		return reversed;
	}

	public static void main(String[] args) {
		System.out.println(ReverseNo.r(12345));
	}

}
