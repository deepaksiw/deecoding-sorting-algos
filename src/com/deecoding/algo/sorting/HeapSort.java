package com.deecoding.algo.sorting;

public class HeapSort {
	public static void main(String[] args) {
		int[] array = { -1, -2, 5, 11, 3, 7, 5, -1, -33, 12, 28, 25, 0, 2, 0 };
		System.out.println("Original Array:");
		print(array);
		makeHeap(array);
		System.out.println("Max Heap of Original Array:");
		print(array);
		sort(array);
		System.out.println("Sorted Array Using Heap Sort:");
		print(array);

	}

	private static void makeHeap(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int child = i, parent = (child - 1) / 2;
			while (parent >= 0) {
				if (array[child] > array[parent]) {
					swap(array, child, parent);
					child = parent;
					parent = (child - 1) / 2;
				} else {
					break;
				}
			}
		}
	}

	private static void sort(int[] array) {
		for (int index = array.length - 1; index >= 0; index--) {
			int child = 0, parent = 0;
			swap(array, 0, index);
			while (child < index) {
				if (2 * parent + 2 < index) {
					child = array[2 * parent + 1] > array[2 * parent + 2] ? 2 * parent + 1 : 2 * parent + 2;
				} else if (2 * parent + 1 < index) {
					child = 2 * parent + 1;
				} else {
					break;
				}
				if (array[parent] < array[child]) {
					swap(array, parent, child);
					parent = child;
				} else {
					break;
				}

			}
		}
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public static void print(int[] array) {
		for (int val : array) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
