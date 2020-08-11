package com.hackermoon.solutions;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,7,8,9,10};
		System.out.println(missingNumber(arr,10));
	}

	private static int missingNumber(int[] arr, int i) {
		int expectedSum = (i*(i+1))/2;
		int actualSum = 0;
		for(int a :arr) {
			actualSum+=a;
		}
		return expectedSum-actualSum;
	}

}
