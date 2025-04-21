package practice;

import java.util.Arrays;
import java.util.Scanner;

public class array {
	Scanner sc = new Scanner(System.in);

	void array1() {
		char arr[] = { 'b', 'h', 'u', 's', 'h', 'a', 'n' };

		for (int i = 6; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

	void array2() {
		int arr[] = { 10, 20, 30, 40, 50 };
		String a = "sarvesh";
		System.out.println(arr.length);
//		System.out.println(arr.length()); //error because length() is used for string not array
		System.out.println(a.length());
		System.out.println(Arrays.toString(arr));
	}

	void array3() {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

	void array4() {
		System.out.println("how many ticket do you want ");
		int noOfTicket = sc.nextInt();
//		System.out.println("type "+noOfTicket+" names for booking");
		String names[] = new String[noOfTicket];
		for (int i = noOfTicket - 1; i >= 0; i--) {
			System.out.println("Type name for ticket");
			names[i] = sc.next();
		}
		System.out.println("here are the tickets for" + Arrays.toString(names));

	}

	char[] array5(int arr[], String[] data, String msg) {
		arr[0] = 34;
		arr[1] = 54;
		arr[2] = 65;
		data[0] = "skm";
		data[1] = "jnc";
		data[2] = "cmc";
		data[3] = "aka";
		System.out.println("your arrays are \n" + Arrays.toString(arr) + "\n" + Arrays.toString(data));
		return new char[5]; // = {'a','b','c','d','e'};
	}

	int[] array6() {
		int a[] = { 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 2 && a[i + 1] == 3) {
				a[i + 1] = 0;

			}
		}
		return a;
	}

	void array7() {
		int r[] = { 9, 2, 3, 4, 5, 9 };
		if (r[0] == 6 || r[r.length - 1] == 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	boolean array8(int a[], int b[]) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1])
			return true;
		return false;

	}

	int array9(int a[]) {
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			x = x + a[i];
		}
		return x;
	}
	
	int array10(int a[]) {
		int largestElement=a[0];
		for(int i:a) {
			if(largestElement<i) {
				largestElement=i;
			}
		}
		return largestElement;
	}

	
	int array11(int a[]) {
		int smallestElement=a[0];
		for(int i:a) {
			if(smallestElement>i) {
				smallestElement=i;
			}
		}
		return smallestElement;
	}
	
	public static void main(String[] args) {
		array obj = new array();
//		obj.array1();

//		obj.array2();

//		obj.array3();

		// obj.array4();

//		obj.array5(new int[3], new String[4], "skml");
		
//		int result[]=obj.array6();
		
//		System.out.println(Arrays.toString(result));
//		obj.array7();
		
//		int x[]= {1,5,9,4,5,6,7};
//		int y[]= {2,2,54,7,8,7};
//		System.out.println(obj.array8(x,y));

//		int s[]= {1,1,1,1,1};
//		System.out.println(obj.array9(s));
		
//		int s[]= {100,154,981,176,198};
//		System.out.println("largest element in tje array is " +obj.array10(s));
//		
//		int y[]= {100,154,981,176,198};
//		System.out.println("smallest element in tje array is " +obj.array11(y));
	}
}
