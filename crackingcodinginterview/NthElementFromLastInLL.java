package com.crackingcodinginterview;

public class NthElementFromLastInLL {

	static class Node{
		int val;
		Node next;
		Node(int value){
			val= value;
			next=null;
		}
	}
	
	static Node head;
	
	static void printList(Node n) {
		while(n!=null) {
			System.out.print(n.val+"->");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		NthElementFromLastInLL list = new NthElementFromLastInLL();
		list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(13); 
        list.head.next.next.next = new Node(14); 
        list.head.next.next.next.next = new Node(15); 
        list.head.next.next.next.next.next = new Node(16); 
        list.head.next.next.next.next.next.next = new Node(17);
        printList(head);
        System.out.println();
        System.out.println(findNthElementFromLast(head,3));
        
	}
	private static int findNthElementFromLast(Node head2, int i) {
		int count =1;
		Node fast = head;
		Node target = head;
		while(count<=i) {
			fast=fast.next;
			count++;
		}
		System.out.println(fast.val);
		while(fast!=null) {
			target = target.next;
			fast= fast.next;
		}
		return target.val;
	}

}
