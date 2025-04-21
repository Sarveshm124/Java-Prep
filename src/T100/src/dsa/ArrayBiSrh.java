package dsa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBiSrh {
	void search() {
		Integer arr[] = { 1, 3, 5, 6, 9, 2, 4 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to search: ");
		int n = sc.nextInt();
		boolean found = false;
		int first = 0, last = arr.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (arr[mid] == n) {
				System.out.println("your no id " + arr[mid] + "  first " + arr[first] + "  last " + arr[last]);
				found = true;
				break;
			} 
			else if (arr[mid] > n) 
				last = mid - 1;
			else if (arr[mid] < n)
				first = mid + 1;
				}
		if (!found) {
			System.out.println("enter correct");
		}
		sc.close();
	}

	public static void main(String[] args) {
		new ArrayBiSrh().search();
	}
}
