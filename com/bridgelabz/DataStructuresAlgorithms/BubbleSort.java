package com.bridgelabz.DataStructuresAlgorithms;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		//takes the input size of array
		int size = scanner.nextInt();
		System.out.print("\nEnter the elements : \n");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//printing array elements
		System.out.println("\nArray Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		//calling bubble sort function 
		bubbleSort(arr);

		System.out.println("\nArray After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	/* method to sort elements of array in
	 * ascending order by using temp variable 
	 * to swap them   */
	static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < (size - i); j++) {
				if (arr[j - 1] > arr[j]) {
					// swapping elements
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}	

}
