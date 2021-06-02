package LinkedList;

public class linkedlist {
	Node head;
	public void insert(int num)
	{
		Node node = new Node();
		node.data = num;
		node.next = null;
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node n = new Node();
			n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAt(int pos, int num)
	{
		// To traverse always create a node which stores head in it.
		Node n = new Node();
		n.data = num;
		n.next = null;
		if(pos == 0)
		{
			insertAtStart(num);
		}
		else
		{
			int i;
			Node node = head; //Like this.
			for(i=0;i<pos-1;i++)
			{
				node = node.next;
			}
			n.next = node.next;
			node.next = n;
		}
	}
	
	public void deleteAt(int pos)
	{
		if(pos == 0)
		{
			head = head.next;
		}
		else
		{
			Node n = head;
			Node temp = null;
			int i;
			for(i=0;i<pos-1;i++)
			{
				n = n.next;
			}
			temp = n.next;
			n.next = temp.next;
			System.out.println("Value deleted : "+temp.data);
		}
	}
	
	
	
	public void insertAtStart(int num)
	{
		Node n = new Node();
		n.data = num;
		n.next = null;
		n.next = head;
		head = n;
	}
	
	public void show()
	{
		Node node = new Node();
		node = head;
		while(node.next != null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}