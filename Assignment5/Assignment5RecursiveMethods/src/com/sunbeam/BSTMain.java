package com.sunbeam;

public class BSTMain {

	public static void main(String[] args) {
 BST bst=new BST();
 bst.addNode(70);
 bst.addNode(30);
 bst.addNode(20);
 bst.addNode(60);
 bst.addNode(100);
 bst.addNode(40);
 bst.addNode(90);
 bst.inOrder();
bst.addNode(10);
bst.inOrder();
if(bst.binarySearch(10))
	System.out.println("key is found");
else
	System.out.println("Key is not found");


	}

}
