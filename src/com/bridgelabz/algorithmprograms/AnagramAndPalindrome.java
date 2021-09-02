package com.bridgelabz.algorithmprograms;

public class AnagramAndPalindrome {
	
	public static void main(String[] args) {
		for (int number = 2; number <= 1000; number++) {
			if (isPrime(number) && isPalindrome(number)) {
				System.out.print(number + " ");
			}
		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrome(int number) {
		 int temp=number,remainder=0,sum=0;    
		  while(number>0){    
		   remainder=number%10;  
		   sum=(sum*10)+remainder;    
		   number=number/10;    
		  }
		  if(temp==sum)
			  return true;
		  else
			  return false;
	}

}
