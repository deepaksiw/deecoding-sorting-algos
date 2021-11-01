package com.deecoding.algo.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] array = { 17, 3, 0, -1, -5, 5, 7, 9, 2, 4, 0, 8 };
		System.out.println("Unsorted Array:");
		print(array);
		sort(array, 0, array.length - 1);
		System.out.println("Sorted Array:");
		print(array);

	}

	private static void sort(int[] ar, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			sort(ar, low, mid);
			sort(ar, mid + 1, high);
			merge(ar, low, mid + 1, high);
		}
	}

	private static void merge(int[] array, int low, int pos, int high) {
		int[] temp = new int[high - low + 1];
		int i = low, j = pos, k = 0;
		for (; i < pos && j <= high;) {
			if (array[i] < array[j]) {
				temp[k++] = array[i++];
			} else {
				temp[k++] = array[j++];
			}
		}
		for (; i < pos;) {
			temp[k++] = array[i++];
		}
		for (; j <= high;) {
			temp[k++] = array[j++];
		}
		for (int val : temp) {
			array[low++] = val;
		}
	}

	private static void print(int[] array) {
		for (int val : array) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
