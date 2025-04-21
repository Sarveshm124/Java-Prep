package practice;
import java.util.Scanner;
public class reverseString {
	Scanner sc= new Scanner (System.in);
	void ReverseString()
		{ 
			System.out.println("type string");
			String a = sc.next();
			String result = "";
			for(int i = a.length()-1;i>=0;i--)
				{
					result += a.charAt(i);
				}
		System.out.println("reverse string is "+ result);
	}
		public static void main(String[]args)
		{
			reverseString obj=new reverseString();
		     obj.ReverseString();
		}
}
