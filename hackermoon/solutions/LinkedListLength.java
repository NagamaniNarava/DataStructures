package com.hackermoon.solutions;

public class LinkedListLength {
	static class Node{
		int val;
		Node next;
		
		Node(int value){
			val = value;
			next=null;
		}
		
		}
	static Node head;
	
	public static void printList(Node n) {
		while(n!=null) {
			System.out.print(n.val+"->");
			n=n.next;
		}
	}
	public static void add(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public static void main(String[] args) {
		LinkedListLength list = new LinkedListLength();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		printList(head);
		
		System.out.println(length(head));
	}
	private static int length(Node n) {
		if(n==null) {
			return 0;
		}
		int r =0;
		r=1+length(n.next);
		return r;
	}
}
