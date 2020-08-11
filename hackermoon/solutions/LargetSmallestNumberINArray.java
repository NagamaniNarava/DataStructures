package com.hackermoon.solutions;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargetSmallestNumberINArray {

	public static void main(String[] args) {
		int[]arr = {6,5,8,9,3,2,7,4};
		
		int min = Arrays.stream(arr).min().getAsInt();
		int max = Arrays.stream(arr).max().getAsInt();
		
		Arrays.sort(arr);
		int min1 = arr[0];
		int max1= arr[arr.length-1];
		System.out.println(min1+" "+max1);
		
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			min2 = Math.min(min, arr[i]);
			max2 = Math.max(arr[i], max2);
		}
		System.out.println("Loop"+min2+" "+max2);
	}

}
