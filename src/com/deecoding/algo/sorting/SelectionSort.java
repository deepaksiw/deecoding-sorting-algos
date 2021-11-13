package com.deecoding.algo.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 2, 3, 1, -1, 7, 0, 3, 0, -11, -1156, 44567 };
		System.out.println("Original Array:");
		print(array);
		System.out.println("Sorted Array:");
		sort(array);
		print(array);
	}

	private static void sort(int[] array) {
		int len = array.length;
		for (int i = 0; i < len; i++) {
			int min_index = i;
			for (int j = i + 1; j < len; j++) {
				if (array[min_index] > array[j]) {
					min_index = j;
				}
			}
			if (min_index != i) {
				int temp = array[min_index];
				array[min_index] = array[i];
				array[i] = temp;
			}
		}
	}

	private static void print(int[] array) {
		for (int elem : array) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
}
