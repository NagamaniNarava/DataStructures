package com.crackingcodinginterview;

import java.util.Iterator;
import java.util.Stack;

public class SortStack {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	public static void main(String[] args) {
		s1.add(5);
		s1.add(2);
		s1.add(7);
		s1.add(9);
		s1.add(1);
		s1.add(6);
		sort();
		
		Iterator i = s2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	private static void sort() {
		while(!s1.isEmpty()) {
			int temp = s1.pop();
			while(!s2.empty()&& s2.peek()>temp) {
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
	}
}
