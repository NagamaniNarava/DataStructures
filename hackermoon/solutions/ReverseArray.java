package com.hackermoon.solutions;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6,7};
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		Arrays.stream(a).boxed().forEach(System.out::println);
	}
}
