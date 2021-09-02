package com.bridgelabz.algorithmprograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		for (int number = 2; number <= 1000; number++) {
			if (findPrime(number)) {
				System.out.print(number + " ");
			}
		}

	}

	private static boolean findPrime(int number) {
		boolean isPrime = true;
		if (number == 1 || number == 0) {
			return false;
		}

		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

}
