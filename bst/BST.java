package com.bst;

public class BST {
	
	static class Node{
		int key;
		Node left;
		Node right;
		
		Node(int value){
			key = value;
			left= null;
			right =null;
		}
	}
	
	static Node root;
	
	public static void insert(int val) {
		if(root == null) {
			root = new Node(val);
			return;
		}
		
		Node current = root;
		Node parent  = root;
		while(current!=null) {
			parent = current;
			if(val<current.key) current = current.left;
			else current = current.right;
		}
		if(val<parent.key) {
			parent.left =  new Node(val);
			return;
		}
		else {
			parent.right = new Node(val);
			return;
		}
	}
	
	
	public static boolean search(int val) {
		Node current = root;
		while(current!=null && val!=current.key) {
			if(val<current.key) current = current.left;
			else current = current.right;
		}
		if(current==null) return false;
		return true;
	}
	
	public static Node finMin(Node n) {
		while(n.left!=null) {
			n = n.left;
		}
		return n;
	}
	static void inorder(Node n) {
		if(n!=null) {
			inorder(n.left);
			System.out.print(n.key+" ");
			inorder(n.right);
		}
	}
	
	static void delete(int val) {
		Node current=root;
		Node parent=root;
		while(current!=null&&val!=current.key) {
			parent = current;
			if(val<current.key) current = current.left;
			else current = current.right;
		}
		if(current == null) return;
		//LEAF NODE
		if(current.left == null && current.right==null) {
			if(parent.left == current) {
				parent.left = null;
			}
			else {
				parent.right = null;
			}
		}
		else if(current.left!=null && current.right!=null) {
			Node successor = finMin(current.right);
			int value = successor.key;
			delete(successor.key);
			current.key =value;
		}
		else {
			boolean left_child = current.left!=null ?true:false;
			Node child = current.left!=null?current.left:current.right;
			current.key = child.key;
			if(left_child) current.left = null;
			else current.right = null;
		}
	}
	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(5);
		bst.insert(10);
		bst.insert(3);
		bst.insert(2);
		bst.insert(1);
		bst.insert(9);
		bst.insert(15);
		bst.insert(12);
		bst.inorder(root);
		System.out.println(bst.search(8));
		System.out.println(bst.finMin(root).key);
		bst.delete(1);
		bst.inorder(root);
		System.out.println();
		bst.delete(3);
		bst.inorder(root);
		System.out.println();
		bst.delete(10);
		bst.inorder(root);
	}

}
