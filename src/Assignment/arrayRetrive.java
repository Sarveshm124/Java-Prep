package Assignment;

import java.util.Scanner;

public class arrayRetrive {
	Scanner sc=new Scanner(System.in);
	int S[]={15,34,67,86,45,87};
	void meth1() {
	
		for(int i=0;i<6;i++) {
			System.out.println("element present in position no " +(i+1)+" is "+S[i]);
		}
	}
	void meth2() {
		System.out.println("retrive in reverse direction");
		for(int j=5;j>=0;j--) {
			System.out.println("element present in position no " +(j+1)+" is "+S[j]);
		}
	}
	void meth3()
	{
		System.out.println("retrive data using forEach");
		for(int i:S) {
			System.out.println(i);
		}
	}
	void meth4() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	void meth5(){
		System.out.println("give employee name: ");
		String empName=sc.next();
		System.out.println("Give Employee ID: ");
		int empId=sc.nextInt();
		System.out.println("Give Employee DEpartment");
		String empDept=sc.next();
		System.out.println("Give employee address");
		sc.nextLine();
		String empAddress=sc.nextLine();
		System.out.println("emp name: "+empName
				+"\n"+"emp id: "+empId
				+"\n"+"emp Department: "+empDept
				+ "\n"+"emp Address: "+empAddress);
	}

	public static void main(String[] args) {
		arrayRetrive obj=new arrayRetrive();
		//obj.meth1();
		//obj.meth2();
		//obj.meth3();
		//obj.meth4();
		obj.meth5();
	}

}
