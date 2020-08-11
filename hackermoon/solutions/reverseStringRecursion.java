package com.hackermoon.solutions;

public class reverseStringRecursion {

	public static void main(String[] args) {
		String s = reverse("nagamani");
		System.out.println(s);
		String s1 = "1234n";
		System.out.println(s1.chars().allMatch(Character::isDigit));
		
		long vowels = s.chars().filter(c -> (c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u')).count();
		long consonants = s.chars().filter(c -> (c != 'a'&& c != 'e'&&c != 'i'&&c != 'o'&&c != 'u')).count();
		System.out.println(vowels);
		System.out.println(consonants);
		
		
		System.out.println("string contains vowel"+s.chars().anyMatch(c -> (c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c == 'u')));
		
		System.out.println(s.chars().filter(c->c=='a').count());
	}

	private static String reverse(String s) {
		if(s.length()<1) return "";
		String result = "";
		result = s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
		return result;
	}
}
