package com.bridgelabz.algorithmprograms;

import java.util.*;

public class BinarySearch<K extends Comparable<K>>{

	public static void main(String[] args) {
		BinarySearch<String> bsArray = new BinarySearch<>();
		ArrayList<String> list=new ArrayList<String>();   
	      list.add("Mango");    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");  
	     System.out.println(list);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter word to be searched");
		String element=scanner.next();
		scanner.close();
		boolean elementFound = bsArray.binarySearch(list,element,0,list.size()-1);
		if(elementFound)
			System.out.println("element found");
		else
			System.out.println("not found");
	}

	public boolean binarySearch(ArrayList<K> array, K element,int low,int high) {
		if (high >= low) {
			int middle = low + (high - low) / 2;
			if (array.get(middle).equals(element)) {
				return true;
			}
			if (array.get(middle).compareTo(element) < 0) {
				return binarySearch(array,element, low, middle - 1);
			}
			else
				return binarySearch(array,element, middle + 1, high);
		}
		return false;	
	}

}
