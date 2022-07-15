package com.bridgelabz.DataStructuresAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	// method for finding two string are anagram or not
	public static boolean findAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		}
		else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
					return true;
			}
		}
			return false;

	}

	public static void main(String[] args) {
		String str1, str2;
		Scanner scanner = new Scanner(System.in);
		//Take input of two strings
		System.out.println("Enter First String :");
		str1 = scanner.next().toLowerCase();
		System.out.println("Enter Second String :");
		str2 = scanner.next().toLowerCase();
		//prints result 
		boolean result = findAnagram(str1, str2);
		if (result) {
			System.out.println("\nTwo String are anagram.");
		}
		else {
			System.out.println("\nTwo String are not anagram.");
		}

	}
}
