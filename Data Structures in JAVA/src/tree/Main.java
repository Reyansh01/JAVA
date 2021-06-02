package tree;
// Code for Binary Tree.

public class Main {

	public static void main(String[] args) {
		Tree t = new Tree();
		Node root = t.createTree();
		t.inOrder(root);
		t.preOrder(root);
		t.postOrder(root);
	}
}
