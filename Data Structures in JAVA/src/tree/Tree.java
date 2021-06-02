package tree;
import java.util.Scanner;
//// Code for Binary Tree.

public class Tree {
	
	Scanner sc = new Scanner(System.in);
	
	public Node createTree()
	{
		Node root = null;
		System.out.print("Enter the data you want to give : ");
		int num = sc.nextInt();
		if(num == -1)
		{
			return null;
		}
		else
		{
			root = new Node(num);
			System.out.print("Enter the left of "+num+" : ");
			root.left = createTree();
			System.out.print("Enter the right of "+num+" : ");
			root.right = createTree();
		}
		return root;
	}
	
	public void inOrder(Node root)
	{
		if(root == null)
		{
			return ;//System.out.println("Empty.");
		}
		else
		{
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
		System.out.println();
	}
	
	public void preOrder(Node root)
	{
		if(root == null)
		{
			return ;//System.out.println("Empty.");
		}
		else
		{
			System.out.print(root.data + " ");
			inOrder(root.left);
			inOrder(root.right);
		}
		System.out.println();
	}
	
	public void postOrder(Node root)
	{
		if(root == null)
		{
			return ;//System.out.println("Empty.");
		}
		else
		{
			inOrder(root.left);
			inOrder(root.right);
			System.out.print(root.data + " ");
		}
		System.out.println();
	}
	
}