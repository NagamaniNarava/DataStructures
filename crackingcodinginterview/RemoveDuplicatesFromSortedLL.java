package com.crackingcodinginterview;

import com.crackingcodinginterview.RemoveDuplicatesFromUnSortedLL.Node;

public class RemoveDuplicatesFromSortedLL {
	static class Node{
		int val;
		Node next;
		Node(int value){
			val = value;
			next=null;
		}
	}
	
	static Node head;
	
	static void printList(Node n){
		while(n!=null) {
			System.out.print(n.val+"->");
			n = n.next;
		}
	}
	public static void main(String[] args) {
		
		RemoveDuplicatesFromSortedLL list = new RemoveDuplicatesFromSortedLL();
		list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(12); 
        list.head.next.next.next = new Node(12); 
        list.head.next.next.next.next = new Node(14); 
        list.head.next.next.next.next.next = new Node(14); 
        list.head.next.next.next.next.next.next = new Node(15); 
        printList(head);
        System.out.println();
        removeFromList(head);
        printList(head);
	}
	private static void removeFromList(Node head) {
		Node n = head;
		while(n!=null && n.next!=null) {
			if(n.val == n.next.val) {
				n.next = n.next.next;
			}else {
				n=n.next;
			}
		}
	}

}
