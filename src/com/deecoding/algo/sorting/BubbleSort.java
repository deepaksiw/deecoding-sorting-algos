package com.deecoding.algo.sorting;

public class BubbleSort {

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
			for (int j = 0; j < len - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
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
