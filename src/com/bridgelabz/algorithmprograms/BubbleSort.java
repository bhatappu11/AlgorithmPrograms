package com.bridgelabz.algorithmprograms;

public class BubbleSort<K extends Comparable<K>> {
	public void bubbleSort(K[] array) {
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[i].compareTo(array[j + 1]) > 0) {
					K temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		printArray(array);
	}
	public void printArray(K[] arr) {
			int n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");
		}
	public static void main(String[] args) {
		BubbleSort<Integer> sortObject= new BubbleSort<>();
		Integer[] array = { 17, 36, 41, 25, 75, 5, 3 };
		sortObject.bubbleSort(array);
	}

}
