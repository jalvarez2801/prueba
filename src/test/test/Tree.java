package test.test;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	static Node root;

	public static List<Integer> getPath(Node root, int n, List<Integer> path) {
		if (root == null) {
			return null;
		}
		path.add(root.data);
		if (root.data == n) {
			return path;
		}
		List<Integer> leftPath = getPath(root.left, n, path);
		if (leftPath != null) {
			return leftPath;
		}
		List<Integer> rightPath = getPath(root.right, n, path);
		if (rightPath != null) {
			return rightPath;
		}
		path.remove(path.size() - 1);
		return null;
	}

	public static int findLCA(int n1, int n2) {
		List<Integer> path1 = new ArrayList<Integer>();
		List<Integer> path2 = new ArrayList<Integer>();
		getPath(root, n1, path1);
		getPath(root, n2, path2);
		int i;
		for (i = 0; i < path1.size() && i < path2.size(); i++) {
			if (!path1.get(i).equals(path2.get(i)))
				break;
		}
		return path1.get(i - 1);
	}

	public static void main(String[] args) {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println("Ancestro común de 4 y 6 es: " + findLCA(4, 6));
		System.out.println("Ancestro común de 3 y 4 es: " + findLCA(3, 4));
		System.out.println("Ancestro común de 2 y 4 es: " + findLCA(2, 4));
	}
}