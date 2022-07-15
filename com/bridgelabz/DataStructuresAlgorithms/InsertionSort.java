package com.bridgelabz.DataStructuresAlgorithms;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		String[] arr = { "Peach", "Banana", "Apple", "Mango", "Tomato", "Pear", "Grapes" };
		System.out.println("Fruit list before sort :"+Arrays.toString(arr));
		String sortedArray[] = insertionSort(arr, arr.length);
		System.out.println("\nFruit list after sort :");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
	}

	/* method to sort elements of array in
	 * ascending order by using temp variable 
	 * to swap them   */
	public static String[] insertionSort(String array[], int size) {
		String temp = "";
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i].compareToIgnoreCase(array[j]) > 0) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
