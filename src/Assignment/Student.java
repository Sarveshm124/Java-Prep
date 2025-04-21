package Assignment;
import java.util.Scanner;
public class Student {
Student(){
	System.out.println("UNknown");
}
Student( String s){
	System.out.println("student name is " + s);
}
public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	new Student();
	System.out.println("type name of student");
	String s =sc.next();
	new Student(s);
	sc.close();
}
}
