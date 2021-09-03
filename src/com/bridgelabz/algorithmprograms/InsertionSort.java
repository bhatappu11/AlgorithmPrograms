package com.bridgelabz.algorithmprograms;

public class InsertionSort<K extends Comparable<K>> {

	public static void main(String[] args) {
		InsertionSort<String> sortObject = new InsertionSort<String>();
		String stringList = "sugar salt pepper sweet sour spice hot cold";
		String[] array = stringList.split(" ");
		sortObject.insertionSort(array);
	}

	public void insertionSort(K[] array) {
        for (int index=1; index<array.length; ++index)
        {
            K key = array[index];
            int movingIndex = index-1;
            while (movingIndex>=0 && array[movingIndex].compareTo(key)>0)
            {
                array[movingIndex+1] = array[movingIndex];
                movingIndex = movingIndex-1;
            }
            array[movingIndex+1] = key;
        }
        for (int index = 0; index < array.length; index++) {
			System.out.print(array[index] + " ");
		}

		
	}

}
