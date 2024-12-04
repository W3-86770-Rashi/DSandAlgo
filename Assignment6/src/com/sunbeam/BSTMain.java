package com.sunbeam;

public class BSTMain {

	public static void main(String[] args) {
		BST bst=new BST();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		bst.addNode(9);
		bst.preOrder();
		bst.postOrder();
		bst.InOrder();
		bst.DFSTraversal();
		bst.BFSTraversal();
		
		if(bst.BinarySearch(19))
			System.out.println("key is found");
		else
			System.out.println("Key is not found");

	}

}
