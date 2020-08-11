package com.hackermoon.solutions;

public class MiddleOfLL {
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
		MiddleOfLL list = new MiddleOfLL();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		printList(head);
		
		int middle = findMiddle(head);
		System.out.println();
		System.out.println(middle);
	}
	private static int findMiddle(Node head) {
		Node fast = head;
		Node slow = head;
		
		while(fast!=null && fast.next!=null ) {
			fast=fast.next.next;
			slow = slow.next;
		}
		return slow.val;
	}
}
