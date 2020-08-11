package com.bst;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,T> extends LinkedHashMap<K,T>{
	public static final int MAX_ENTRIES = 3;
	LRUCache(int initalCapacity,float loadFactor,boolean actualOrder){
		super(initalCapacity,loadFactor,true);
	}
	@Override
	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size()>MAX_ENTRIES;
	}
	
	public static void main(String[] args) {
		Map<String, String> lru = new LRUCache<>(16, 0.75f, true);
		
		lru.put("a","A");
		lru.put("b","B");
		lru.put("c","C");
		System.out.println(lru);
		lru.get("a");
		System.out.println(lru);
		lru.get("b");
		System.out.println(lru);
	}
}
