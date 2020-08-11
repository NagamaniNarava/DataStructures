package com.crackingcodinginterview;

public class RotateIsSubString {

	public static void main(String[] args) {
		String s = "waterbottle";
		System.out.println(isSubString(s,"erbottlewal"));
	}

	private static boolean isSubString(String s, String string) {
		String result = s+s;
		return result.contains(string);
	}

}
