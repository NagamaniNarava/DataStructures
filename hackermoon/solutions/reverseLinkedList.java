package com.hackermoon.solutions;

public class reverseLinkedList {
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
		reverseLinkedList list = new reverseLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		printList(head);
		System.out.println();
		printList(reverseLL(head));
	}

	private static Node reverseLL(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;	
	}

}











