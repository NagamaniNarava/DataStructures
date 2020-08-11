package com.bst;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch(a,5));
		System.out.println(binarySearchRecursively(a,6));
		
		
	}

	private static int binarySearchRecursively(int[] a, int i) {
		return binarySearchRecursively(a,0,a.length,i);
	}

	private static int binarySearchRecursively(int[] a, int start, int end, int value) {
		if(start >= end) return -1;
		int mid = start+(end-start)/2;
		System.out.println("mid:"+mid);
		if(a[mid] == value) return mid;
		else if(a[mid]<value) return binarySearchRecursively(a,mid+1,end,value);
		else return binarySearchRecursively(a,start,mid-1,value);
	}

	private static int binarySearch(int[] a, int i) {
		int start = 0;
		int end =a.length;
		while(start<end) {
			int mid = (start+end)/2;
			if(a[mid] == i) return mid;
			else if(a[mid]<i) start = mid+1;
			else end = mid;
		}
		return -1;
	}
	
	

}
