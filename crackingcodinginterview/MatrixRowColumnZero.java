package com.crackingcodinginterview;

import java.util.Arrays;

public class MatrixRowColumnZero {

	public static void main(String[] args) {
		int[][] a = {{1,2,3},{0,5,0},{7,8,9}};
		makeRowColumnZero(a);
	}

	private static void makeRowColumnZero(int[][] a) {
		int[] row = new int[a.length];
		int[] column = new int[a[0].length];
		for(int i=0;i<a.length;i++) {
			for(int j =0 ;j<a[i].length;j++) {
				if(a[i][j] == 0) {
					row[i]=1;
					column[j]=1;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j =0 ;j<a.length;j++) {
				if(row[i] == 1 || column[j]==1) {
					a[i][j]=0;
				}
			}
		}
		System.out.println(Arrays.deepToString(a));
	}

}
