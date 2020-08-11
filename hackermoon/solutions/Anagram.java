package com.hackermoon.solutions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		boolean b = anagram("nagamani","nagamani");
		System.out.println(b);
	}

	private static boolean anagram(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		String s1Final = new String(s1Array);
		String s2Final = new String(s2Array);
		return s1Final.equals(s2Final);
	}

}
