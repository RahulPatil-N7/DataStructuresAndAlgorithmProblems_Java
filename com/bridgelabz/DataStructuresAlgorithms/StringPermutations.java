package com.bridgelabz.DataStructuresAlgorithms;

import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args) {
		//Takes input string
		System.out.println("Enter a String :");

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int size = str.length();
		//creating object to call method 
		StringPermutations permutation = new StringPermutations();
		permutation.permute(str, 0, size - 1);
	
	}
	
	//recursive method to find string permutations
	private void permute(String str, int l, int r) {
		if (l == r)
			System.out.println(str);
		else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);
				str = swap(str, l, i);
			}
		}
	}

	//swapping array elements
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
