package com.bridgelabz.DataStructuresAlgorithms;

import java.util.Scanner;

public class PrimeNumberRange {
	
	//returns true if number is prime
	public boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//takes range input
		System.out.println("Enter the range to print prime numbers: ");
		int input = scanner.nextInt();
		//creating object
		PrimeNumberRange primeNumbers = new PrimeNumberRange();
		
		System.out.println("Prime numbers upto " + input + " is: ");
		for (int i = 0; i <= input; i++) {
			if(primeNumbers.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
