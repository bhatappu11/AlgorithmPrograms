package com.bridgelabz.algorithmprograms;
import java.util.*;
public class FindYourNumber {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		if((int)(Math.ceil((Math.log(N) / Math.log(2)))) !=
       (int)(Math.floor(((Math.log(N) / Math.log(2)))))) {
			System.err.println("N must be a power of 2");
			System.exit(0);
		}
		System.out.println("Think of a number between 0 and "+(N-1));
		int result=guessNumber(0,N-1);
		System.out.println("your number is: "+result);

	}

	public static int guessNumber(int low, int high) {
		if(low == high) {
			return low;
		}
		int mid = (low+high)/2;
		System.out.println("Is your number between "+(low)+" and "+(mid)+"?");
		System.out.println("Enter 1 if true or enter 0");
		int option = scanner.nextInt();
		
		switch(option) {
		case 1: return guessNumber(low,mid);
		case 0: return guessNumber(mid+1,high);
		default: System.err.println("Invalid option");
		System.exit(0);
		return -1;
		}
		
	}

}
