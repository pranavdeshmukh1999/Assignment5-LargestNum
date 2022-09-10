package com.blz.assign5;

public class LargestAmong3 {

	public static void main(String[] args) {

		int n1 = 12, n2 = 5, n3 = 25;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

		else
			System.out.println(n3 + " is the largest number.");
	}
}
