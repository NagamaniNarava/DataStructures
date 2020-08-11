package com.hackermoon.solutions;

public class Factorial {

	public static void main(String[] args) {
		int f = factorial(4);
		System.out.println(f);
	}

	private static int factorial(int n) {
		if(n==1)
		return 1;
		int f = 1;
		f = n*factorial(n-1);
		return f;
	}

}
