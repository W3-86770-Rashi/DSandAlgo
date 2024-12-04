package com.sunbeam;

import com.sunbeam.BST.Node;

public class BST {
static class Node{
	private int data;
	private Node left;
	private Node right;
	public Node (int value) {
		data=value;
		left =right=null;
		
	}
	
}
private Node root;
public BST() { 
	root =null;
}

private boolean isEmpty() {
	return root==null;
}
public void inOrder() {
	System.out.println("Inorder:");
	InOrder(root);
	System.out.println();
	
}
private void InOrder(Node trav) {
	if (trav==null)
		return;
	InOrder(trav.left);
	System.out.println(""+trav.data);
	InOrder(trav.right);
}
public void addNode(int value)
{
	if(root==null)
		root=new Node(value);
	else
		addNode(value,root);
}
private void addNode(int value,Node trav) {
if(value<trav.data) {
	if(trav.left==null)
	trav.left=new Node(value);
	else 
		addNode(value,trav.left);
}
else {
	if(trav.right==null)
    trav.right=new Node(value);
	else
		addNode(value,trav.right);
	
}
	
}
private Node binarySearch(int key,Node trav)
{
	if(trav==null)
    return null;
	if(key==trav.data)
     return trav;
	if(key<trav.data)
		return binarySearch(key,trav.left);
	else
		return binarySearch(key,trav.right);
		

	
	
}
public boolean binarySearch(int key)
{
	Node trav=root; 
	Node result = binarySearch(key,trav); 
	if (result != null) 
		return true;
	else 
     return false;
	
}
}



