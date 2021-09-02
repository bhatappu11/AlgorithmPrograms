package com.bridgelabz.algorithmprograms;

import java.util.*;
public class Anagram {
	public static boolean checkIfAnagram(String word1, String word2) {
		char[] wordOneArray = word1.toCharArray();
		char[] wordTwoArray = word2.toCharArray();
		Arrays.sort(wordOneArray);
		Arrays.sort(wordTwoArray);
		int compareResult = Arrays.compare(wordOneArray, wordTwoArray);

		if(compareResult == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two words");
		String word1 = scanner.next();
		String word2 = scanner.next();
		scanner.close();
		boolean result = checkIfAnagram(word1.toLowerCase(),word2.toLowerCase());
		if(result==true)
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
	}

}
