package com.crackingcodinginterview;

import java.util.Stack;

public class ImplementQueueWithTwoStacks {

	static Stack<Integer> s1 = new Stack<>();
	static Stack<Integer> s2 = new Stack<>();
	
	static void add(int value){
		s1.push(value);
	}
	static int remove() {
		if(!s2.isEmpty()) return s2.pop();
		while(!s1.isEmpty()) s2.push(s1.pop());
		return s2.pop();
	}
	static int peek() {
		if(!s2.isEmpty()) return s2.peek();
		while(!s1.isEmpty()) s2.push(s1.pop());
		return s2.peek();
	}
	public static void main(String[] args) {
		ImplementQueueWithTwoStacks queue = new ImplementQueueWithTwoStacks();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println(queue.remove());
		queue.add(4);
		queue.add(5);
		System.out.println(queue.peek());
	}

}
