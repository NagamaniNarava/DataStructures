package com.crackingcodinginterview;

import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class BeginingOftheLoopInLL {

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
			System.out.println(n.val+" ");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		BeginingOftheLoopInLL list= new BeginingOftheLoopInLL();
		String s = "nagamani";
		Set<Character> l = s.chars().mapToObj(c->(char)c).collect(Collectors.toSet());
		list.head = new Node(10); 
        list.head.next = new Node(12); 
        list.head.next.next = new Node(13); 
        list.head.next.next.next = new Node(14); 
        list.head.next.next.next.next = new Node(15); 
        list.head.next.next.next.next.next = new Node(16); 
        list.head.next.next.next.next.next.next = new Node(17);
        list.head.next.next.next.next.next.next.next = list.head.next.next;
        //printList(head);
        //System.out.println();
        Node loopNode = loopExists(head);
        Node beginingLoop = beginingOftheLoop(head,loopNode);
        System.out.println(beginingLoop.val);
        for(char c : s.toCharArray()) {
        	Stack<Character> st = new Stack<Character>();
        	if(st.empty()) System.out.println("empty");

        }
        
	}
	private static Node beginingOftheLoop(Node head, Node loopNode) {
		Node point = head;
		
		while(point!=loopNode) {
			point = point.next;
			loopNode = loopNode.next;
		}
		
		return point;
	}
	private static Node loopExists(Node n) {
		Node fast = n;
		Node slow = n;
		while(slow!=null && fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(slow == fast) {
				return slow;
			}
		}
		return null;
	}
}
