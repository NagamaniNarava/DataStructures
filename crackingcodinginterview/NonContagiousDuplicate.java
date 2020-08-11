package com.crackingcodinginterview;

public class NonContagiousDuplicate {

	public static void main(String[] args) {
		removeContagiousDuplicates("nagaammanni".toCharArray());
		System.out.println();
	}

	private static void removeContagiousDuplicates(char[] str) {
		boolean hit[] = new boolean[256];
		int tail=1;
		for(int i=0;i<hit.length;i++) hit[i] = false;
		hit[str[0]] = true;
		for (int i = 1; i < str.length; i++) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail]=0;
		System.out.println(new String(str));
	}
}
