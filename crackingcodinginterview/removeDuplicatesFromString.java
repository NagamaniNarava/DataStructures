package com.crackingcodinginterview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class removeDuplicatesFromString {

	public static void main(String[] args) {
		System.out.println(removeDuplicates("nagamani"));
		System.out.println(removeDuplicatesv1("nagamani"));
	}

	private static String removeDuplicates(String s) {
		String str = Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
		return str;
	}
	
	private static String removeDuplicatesv1(String s) {
		String result ="";
		for(int i=0;i<s.length();i++) {
			if(!result.contains(String.valueOf(s.charAt(i)))) {
				result += s.charAt(i);
			}
		}
		return result;
	}
}
