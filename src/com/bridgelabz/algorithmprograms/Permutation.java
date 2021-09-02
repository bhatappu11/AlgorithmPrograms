package com.bridgelabz.algorithmprograms;

import java.util.*;

public class Permutation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.next();
		scanner.close();
		System.out.println("Permutations found by Iteration");
		permutationByIteration(string);
		System.out.println("Permutations found by Recursion ");
		permutationByRecursion(string,"");
	}

	private static void permutationByRecursion(String string,String result) {
		if(string.length()==0) {
			System.out.println(result+" ");
		}
		 for (int index = 0; index < string.length(); index++) {
	            char ch = string.charAt(index);
	            String restOfString = string.substring(0, index) + string.substring(index + 1);
	            permutationByRecursion(restOfString, result + ch);
	        }
	}

	private static void permutationByIteration(String string) {
		if (string == null || string.length() == 0) {
            return;
        }
        ArrayList<String> partialPermutation = new ArrayList<>();
        partialPermutation.add(String.valueOf(string.charAt(0)));
        for (int i = 1; i < string.length(); i++)
        {
            for (int j = partialPermutation.size() - 1; j >= 0; j--)
            {
                String s = partialPermutation.remove(j);
                for (int k = 0; k <= s.length(); k++)
                {
                    partialPermutation.add(s.substring(0, k) + string.charAt(i) + s.substring(k));
                }
            }
        }
 
        System.out.println(partialPermutation);
		
	}

}
