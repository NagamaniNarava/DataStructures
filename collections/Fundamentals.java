package com.collections;

import java.util.HashMap;
import java.util.Map;

public class Fundamentals {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<>();
		map.put(1, "Nagamani");
		map.put(2, "avinash");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			if(entry.getValue().equals("Nagamani")) {
				System.out.println(entry.getKey());
			}
		}
	}

}
