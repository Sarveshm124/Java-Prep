package practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//This program check where a given string is isogram or not (isogram is a word without repeated character)


public class isogram {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
				System.out.println("Type a String to check if it is isogram or not");
		String s= sc.next();
		
		if(Isogram(s)==true) {
			System.out.println("this string is a isoram");
		}
		else {
			System.out.println("this string is not isogram");
		}
		
		sc.close();
	}
	
	
static boolean Isogram(String s)
{ 
	boolean isIsogram = true;
char[] ch = s.toCharArray();
Set<Character> chSet =new HashSet<Character>();

for (Character c : ch) {
	
	if(chSet.contains(c)) {
		isIsogram=false;
	}
	else {
		chSet.add(c);
	}
}
	return isIsogram;
	}
}  
