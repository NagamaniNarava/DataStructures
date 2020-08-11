package com.hackermoon.solutions;

import com.hackermoon.solutions.MiddleOfLL.Node;

public class NthFromLastInLL {
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
		NthFromLastInLL list = new NthFromLastInLL();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		printList(head);
		
		Node nthNode = nthFromLast(head,2);
		System.out.println();
		System.out.println(nthNode.val);
		
	}
	private static Node nthFromLast(Node head2, int i) {
		
		int count =1;
		Node fast = head;
		Node slow = head;
		while(count <=i) {
			fast = fast.next;
			count ++;
		}
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
