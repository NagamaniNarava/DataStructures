package com.hackermoon.solutions;

import java.util.HashMap;
import java.util.Map;

public class DuplicatesInString {

	public static void main(String[] args) {
		duplicatesInString("nagamani");
	}

	private static void duplicatesInString(String s) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i),1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " "+entry.getValue());
			}
		}
		System.out.println("JAVA8");
		map.entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));
		
	}
}
