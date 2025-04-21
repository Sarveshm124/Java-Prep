package Assignment;
import java.util.Scanner;
public class addAmount {
	static int Amount=500;
addAmount(){
	System.out.println("your ammount is "+ Amount);
}
addAmount(int finalAmount){
	System.out.println("Your amount is "+ finalAmount);
}
	public static void main(String[] args) {
		new addAmount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Type amount you want to insert");
		int insertAmount=sc.nextInt();
		int finalAmount=insertAmount+Amount;
		new addAmount(finalAmount);
		sc.close();

	}

}
