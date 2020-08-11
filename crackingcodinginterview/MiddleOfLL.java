package com.crackingcodinginterview;

public class MiddleOfLL {
	static class Node{
		int val;
		Node next;
		
		Node(int value){
			val=value;
			next=null;
		}
	}
	static Node head;
	
	static void printList(Node n) {
		while(n!=null) {
			System.out.print(n.val+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		MiddleOfLL list = new MiddleOfLL();
		list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(13); 
        list.head.next.next.next = new Node(14); 
        list.head.next.next.next.next = new Node(15); 
        list.head.next.next.next.next.next = new Node(16); 
        list.head.next.next.next.next.next.next = new Node(17);
        printList(head);
        System.out.println();
        System.out.println(findMiddleOfLL(head));
	}
	private static int findMiddleOfLL(Node head2) {
		Node fast = head;
		Node target = head;
		while(fast.next!=null) {
			System.out.println(fast.val);
			System.out.println(target.val);
			fast = fast.next.next;
			target = target.next;
		}
		return target.val;
	}

}
