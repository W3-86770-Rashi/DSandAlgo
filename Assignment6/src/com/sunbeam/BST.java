package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BST {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value)
		{
			data=value;
			left=right=null;
			
		}
	}
private Node root;
public BST(){
	root=null;
	
}
public boolean isEmpty() {
	return root==null;
}
public void deleteAll() {
	root=null;
}
public void addNode(int value) {
	Node newnode=new Node(value);
	if(root==null)
	{
		root=newnode;
	}
	else
	{
		Node trav=root;
		while(true) {
		if(value<trav.data) {
		if(trav.left==null) {
		
			trav.left=newnode;
			break;
		}
		else 
		
			trav=trav.left;	
		}
		else {
			if( trav.right==null) {
				trav.right=newnode;
				break;
			   }
			
			else 
				trav = trav.right;
		}
		
		}
		}
		}
private void preOrder(Node trav) {
	if(trav==null)
	return;
		System.out.println(""+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
public void preOrder() {
	System.out.println("Preorder:");
	preOrder(root);
	System.out.println();
	
}
private void InOrder(Node trav) {
	if (trav==null)
		return;
	InOrder(trav.left);
	System.out.println(""+trav.data);
	InOrder(trav.right);
}
public void InOrder() {
	System.out.println("Inorder:");
	InOrder(root);
	System.out.println();
	
}
private void postOrder(Node trav) {
	if(trav==null)
		return;
	postOrder(trav.left);
	postOrder(trav.right);
	System.out.println(""+trav.data);
	
	
}
public void postOrder() {
	System.out.println("Postorder:");
	postOrder(root);
	System.out.println();
}
public void DFSTraversal() {
	Stack<Node> st=new Stack<BST.Node>();
	st.push(root);
	System.out.println("DFS Traversal");
	while(!st.isEmpty())
	{
		Node trav=st.pop();
		System.out.println(""+trav.data);
		if(trav.right!=null) 
		st.push(trav.right);
		if(trav.left!=null)
			st.push(trav.left);
	}
}
public void BFSTraversal() {
	Queue<Node> q=new LinkedList<BST.Node>();
	q.offer(root);
	System.out.println("B Traversal");
	while(!q.isEmpty())
	{
		Node trav=q.poll();
		System.out.println(""+trav.data);
		if(trav.left!=null) 
		q.offer(trav.left);
		if(trav.right!=null)
			q.offer(trav.right);

	}
System.out.println();
}
public boolean BinarySearch(int key) {
	Node trav=root;
	
	while(trav!=null) {
		if (key==trav.data)
			return true;
		if(key<trav.data)
			trav=trav.left;
		else
			trav=trav.right;}
	return false;
			
	}

}








