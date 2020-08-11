package com.hackermoon.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class PairOfArrayWhoseSomeIsInput {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		pairOfArrayv1(arr,5);
	}

	private static HashMap pairsOfArray(int[] input,int n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(input[i]+input[j]==n) {
					map.put(input[i],input[j]);
				}
			}
		}
		System.out.println(map);
		return map;
	}
	
	private static void pairOfArrayv1(int[] input,int n){
		HashSet<Integer> set = new HashSet<>(Arrays.stream(input).boxed().collect(Collectors.toList()));
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<input.length;i++) {
			int temp = n-input[i];
			if(set.contains(temp)) {
				map.put(input[i],temp);
			}
		}
		System.out.println(map);
	}

}
