/*Insert an element into a binary search tree (in order). You may assume that the binary search tree contains integers */

import java.util.*;

class Node {
	
	int value;
	Node left;
	Node right;
	
	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}

class JavaTree {
	Node root;
    
    static int total;
	
	public void traverseRecursionTree(Node node) {
		if (node != null) {
			traverseRecursionTree(node.left);
			System.out.print(" " + node.value);
			traverseRecursionTree(node.right);
		}
	}

static boolean insert(Node node, int data) {
	if (node == null) return false;	
	
	if (data <= node.value) {
		if (node.left == null) {
			node.left = new Node(data);
		} else {
			return insert(node.left, data);
		}
	} else {
		if (node.right == null) {
			node.right = new Node(data);
		} else {
			return insert(node.right, data);
		}
	}
	return true;
}

static int suma(Node node) {
	if (node == null) return 0;
	return node.value + suma(node.left) + suma(node.right);
}

public static void main (String[] args) {
	
	JavaTree javaTree = new JavaTree();
	javaTree.root = new Node(10);
	insert(javaTree.root, 15);
	insert(javaTree.root, 5);
	insert(javaTree.root, 7);
	insert(javaTree.root, 8);
	
	total = suma(javaTree.root);
	
	javaTree.traverseRecursionTree(javaTree.root);
    System.out.print("; Suma = " + total);
	
	}
}