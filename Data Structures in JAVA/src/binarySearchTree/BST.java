package binarySearchTree;

import java.util.Scanner;

public class BST {
	
	Scanner sc = new Scanner(System.in);
	Node root;
	
	public BST()
	{
		root = null;
	}
	
	public void createBST()
	{
		System.out.print("Enter data : ");
		int num = sc.nextInt();
		if(num == -1)
		{
			return ;
		}
		else
		{
			root = createBSTtree(root,num);
		}
		createBST();
	}
	
	public Node createBSTtree(Node root, int num)
	{
		if(root == null)
		{
			root = new Node(num);
			return root;
		}
		else if(num < root.num)
		{
			root.left = createBSTtree(root.left,num);
		}
		else if(num > root.num)
		{
			root.right = createBSTtree(root.right, num);
		}
		return root;
	}
	
	public void inOrder()
	{
		inOrderpass(root);
	}
	
	public void inOrderpass(Node root)
	{
		if(root != null)
		{
			inOrderpass(root.left);
			System.out.print(root.num + " ");
			inOrderpass(root.right);
		}
	}	
}
