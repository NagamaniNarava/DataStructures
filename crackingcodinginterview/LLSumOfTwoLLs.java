package com.crackingcodinginterview;

public class LLSumOfTwoLLs {
	
	static class Node{
		int val;
		Node next;
		
		Node(int data){
			val = data;
			next = null;
		}
	}
	Node head;
	public void insert(int data) {
		head = insert(head,data);
	}
	private Node insert(Node node, int data) {
		if(node==null) {
			node = new Node(data);
			return node;
		}
		node.next = insert(node.next,data);
		return node;
	}
	
	void printLL(Node node){
		if(node!=null) {
			System.out.print("->"+node.val);
			printLL(node.next);
		}
	}
	public static void main(String[] args) {
		LLSumOfTwoLLs l1  = new LLSumOfTwoLLs();
		l1.insert(1); 
		l1.insert(5); 
		l1.insert(9); 
		l1.printLL(l1.head);
		System.out.println();
		LLSumOfTwoLLs l2  = new LLSumOfTwoLLs();
		l2.insert(0); 
		l2.insert(0); 
		l2.insert(9);
		l2.insert(1);
		l2.printLL(l2.head);
		LLSumOfTwoLLs l3  = new LLSumOfTwoLLs();
		l3.head = sumOf2LLs(l1.head,l2.head);
		System.out.println();
		l3.printLL(l3.head);
	}
	private static Node sumOf2LLs(Node l1, Node l2) {
		Node newListHead = new Node(0);
		Node l3 = newListHead;
		int carry =0;
		while(l1!=null || l2!=null) {
			int value1 = (l1!=null)?l1.val:0;
			int value2 = (l2!=null)?l2.val:0;
			
			int sum = value1+value2+carry;
			carry = sum/10;
			int lastDigit = sum%10;
			
			Node newNode = new Node(lastDigit);
			l3.next = newNode;
			if(l1!=null) l1 = l1.next;
			if(l2!=null) l2 = l2.next;
			l3 = l3.next;
		}
		
		if(carry>0) {
			Node newNode = new Node(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		return newListHead.next;
	}
}
