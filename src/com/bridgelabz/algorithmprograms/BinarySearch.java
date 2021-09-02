package com.bridgelabz.algorithmprograms;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		String[] array = {"six","seven","one","two","four"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word to be searched");
		String element=scanner.next();
		scanner.close();
		boolean elementFound = binarySearch(array,element);
		if(elementFound == true)
			System.out.println("element found");
		else
			System.out.println("not found");
	}

	private static boolean binarySearch(String[] array, String element) {
		int low = 0, high = array.length - 1;
		 while (low <= high) {
	            int mid = low + (high - low) / 2;
	            int res = element.compareTo(array[mid]);
	            if (res == 0)
	                return true;
	            if (res > 0)
	                low = mid + 1;
	            else
	                high = mid - 1;
	        } 
		return false;
	}

}
