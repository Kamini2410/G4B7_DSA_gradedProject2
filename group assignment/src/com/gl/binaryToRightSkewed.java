package com.gl;

//Java implementation to 
//binary search tree into a right-skewed-tree

//Class of the node
class Node
{
	int val;
	Node left, right;
	
	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	Node(int item)
	{
		val = item;
		left = right = null;
	}
}
class binaryToRightSkewed
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	
	static void bstToRightSkewed(Node root)
	{
	
		// Base Case
		if(root == null)
		{
			return;
		}
		
		bstToRightSkewed(root.left);
		
		Node rightNode = root.right;
		
	
		// Condition to check if the root Node
		// of the skewed tree is not defined
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
	
		
		bstToRightSkewed(rightNode);
		
	}

	// Function to traverse the right
	// skewed tree using recursion
	static void traverseRightSkewedTree(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewedTree(root.right);	
	}

	// Driver Code
	public static void main (String[] args)
	{
	
		binaryToRightSkewed tree = new binaryToRightSkewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left=new Node(10);
		tree.node.right.left=new Node(55);
	
		bstToRightSkewed(node);
		traverseRightSkewedTree(headNode);
	}
}



