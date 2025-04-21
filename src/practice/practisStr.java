package practice;
import java.util.Scanner;

public class practisStr {
	Scanner sc=new Scanner(System.in);
void meth1() {
	
	System.out.println("give me first no");
	int c=sc.nextInt();
	System.out.println("give me second no");
	int f=sc.nextInt();
	
	

    System.out.println(c+" + "+f +"= "+(c+f));
    System.out.println(c+" - "+f +"= "+(c-f));
    System.out.println(c+" * "+f +"= "+(c*f));
    System.out.println(c+" / "+f +"= "+(c/f));
			
	sc.close();
	}
public static void main (String []args) {
	practisStr obj1=new practisStr();
	obj1.meth1();
	
}

}
