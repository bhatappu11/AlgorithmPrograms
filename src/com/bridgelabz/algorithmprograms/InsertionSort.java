package com.bridgelabz.algorithmprograms;

public class InsertionSort {

	public static void main(String[] args) {
		String stringList = "sugar salt pepper sweet sour spice hot cold";
		String[] array = stringList.split(" ");
		insertionSort(array);
	}

	private static void insertionSort(String[] array) {
        for (int index=1; index<array.length; ++index)
        {
            String key = array[index];
            int movingIndex = index-1;
            while (movingIndex>=0 && array[movingIndex].compareToIgnoreCase(key)>0)
            {
                array[movingIndex+1] = array[movingIndex];
                movingIndex = movingIndex-1;
            }
            array[movingIndex+1] = key;
        }
        for (String word : array) {
			System.out.print(word + " ");
		}

		
	}

}
