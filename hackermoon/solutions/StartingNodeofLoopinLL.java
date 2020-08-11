package com.hackermoon.solutions;

public class StartingNodeofLoopinLL {

	static class Node{
		int val;
		Node next;
		
		Node(int value){
			val = value;
			next = null;
		}
	}
	
	static Node head;
	
	public static void add(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	public static void main(String[] args) {
		StartingNodeofLoopinLL list = new StartingNodeofLoopinLL();
		list.head = new Node(10); 
        list.head.next = new Node(12); 
//        list.head.next.next = new Node(13); 
//        list.head.next.next.next = new Node(14); 
//        list.head.next.next.next.next = new Node(15); 
//        list.head.next.next.next.next.next = new Node(16); 
//        list.head.next.next.next.next.next.next = new Node(17);
//        list.head.next.next.next.next.next.next.next = list.head.next.next;
        
        Node loopNode = loopExists(head);
        System.out.println(loopNode);
        
        //Node startLoopNode = beginingOfTheLoop(head,loopNode);
        //System.out.println(startLoopNode.val);
	}
	private static Node beginingOfTheLoop(Node n, Node loopNode) {
		
		while(n!=loopNode) {
			n=n.next;
			loopNode = loopNode.next;
		}
		return n;
	}
	private static Node loopExists(Node head2) {
		Node fast = head;
		Node slow = head;
		
		while(slow!=null&&fast!=null&&fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}

}
