package Queue;

// For circular queue we will be changing the values of rear and front.
public class queue {
	int queue[] = new int[5];
	int size = 0;
	int rear = 0;
	int front = 0;
	
	public void enQueue(int num) // push in stack.
	{
		if(!isFull())
		{
			queue[rear] = num;
			rear = ((rear+1)%5);
			size++;
		}
		else
		{
			System.out.println("Queue is already FULL.");
		}
	}
	
	public void show()
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.print(queue[((front+i)%5)] + " ");
		}
		System.out.println();
	}
	
	public void deQueue() // pop in stack
	{
		if(!isEmpty())
		{
			System.out.print("deleted element is : ");
			System.out.println(queue[front]);
			front = ((front+1)%5);
			size--;
		}
		else
		{
			System.out.println("Queue is already EMPTY.");
		}
	}
	
	public int getsize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		if(getsize() == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isFull()
	{
		if(getsize() == 5)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
