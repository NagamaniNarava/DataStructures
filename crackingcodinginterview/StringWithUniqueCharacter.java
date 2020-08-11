package com.crackingcodinginterview;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringWithUniqueCharacter {

	public static void main(String[] args) {
		System.out.println(isUniqueCharacters("nagamani"));
		System.out.println(isUniqueCharactersv1("mani"));
		System.out.println(isUniqueCharactersv2("nagamani"));
	}

	private static boolean isUniqueCharacters(String string) {
		for(int i=0;i<string.length();i++) {
			if(string.indexOf(string.charAt(i))!=string.lastIndexOf(string.charAt(i))) return false;
		}
		return true;
	}
	
	private static boolean isUniqueCharactersv1(String string) {
		boolean check[] = new boolean[256];
		
		for(int i=0;i<string.length();i++) {
			if(check[string.charAt(i)]) return false;
			check[string.charAt(i)] = true;
		}
		return true;
	}
	
	private static boolean isUniqueCharactersv2(String string) {
		char[] arr = string.toCharArray();
		Arrays.sort(arr);
		String s = new String(arr);
		System.out.println(s);
		for(int i=0;i<string.length() && (i+1<s.length());i++) {
			if(s.charAt(i)==s.charAt(i+1)) return false;
		}
		return true;
	}
	
	

}
