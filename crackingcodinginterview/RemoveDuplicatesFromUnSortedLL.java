package com.crackingcodinginterview;

import java.util.HashSet;

public class RemoveDuplicatesFromUnSortedLL {

	static class Node{
		int val;
		Node next;
		
		Node(int value){
			val = value;
			next=null;
		}
	}
	static void printList(Node n){
		while(n!=null) {
			System.out.print(n.val+"->");
			n=n.next;
		}
	}
	static Node head;
	public static void main(String[] args) {
		RemoveDuplicatesFromUnSortedLL list = new RemoveDuplicatesFromUnSortedLL();
		list.head = new Node(10); 
        list.head.next = new Node(10); 
        list.head.next.next = new Node(11); 
        list.head.next.next.next = new Node(11); 
        list.head.next.next.next.next = new Node(12); 
        list.head.next.next.next.next.next = new Node(11); 
        list.head.next.next.next.next.next.next = new Node(10); 
        printList(head);
		//removeDuplicates(head);
        removeDuplicatesWithOutBuffer();
		System.out.println();
		printList(head);
	}
	private static void removeDuplicates(Node n) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		Node curr = n;
		while(curr!=null) {
			if(set.add(curr.val)) {
				prev = curr;
			}
			else {
				prev.next = curr.next;
			}
			curr = curr.next;
		}
	}
	private static void removeDuplicatesWithOutBuffer() {
		Node curr = head;
		while(curr!=null) {
			Node runner = curr.next ;
			Node runnerPrev = curr ;
			while(runner!=null) {
				if(runner.val == curr.val) {
					runnerPrev.next = runner.next;
				}
				else {
					runnerPrev = runner;
				}
				runner = runner.next;
			}
			curr = curr.next;
		}
	}
}
