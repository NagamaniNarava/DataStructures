package com.hackermoon.solutions;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingCharacter("nagamani"));
		System.out.println(firstNonRepeatingCharacterv1("nagamani"));
		System.out.println(firstNonRepeatingCharacterv2("nagamani"));
		
		int x=10;
		int y= 20;
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println(x+" "+y);
	}

	private static char firstNonRepeatingCharacterv2(String s) {
		int[] temp = new int[26];
		char[] arr = s.toCharArray();
		for(char c : arr) temp[c-'a']++;
		for(char c : arr) {
			if(temp[c-'a'] == 1) return c;
		}
		return '0';
	}

	private static char firstNonRepeatingCharacterv1(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) return s.charAt(i);
		}
		return '0';
	}

	private static char firstNonRepeatingCharacter(String s) {
		for(int i=0;i<s.length();i++){
			if(!s.substring(i+1, s.length()).contains(String.valueOf(s.charAt(i)))) return s.charAt(i) ;
		}
		return '0';
	}
}
