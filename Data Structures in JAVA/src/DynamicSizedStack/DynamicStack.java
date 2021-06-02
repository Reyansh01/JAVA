package DynamicSizedStack;

public class DynamicStack {
	//We will increase the size of the array with the multiple of 2.
	
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;
	
	public void push(int num)
	{
		if(size() == capacity)
		{
			expandTheArr();
		}
		stack[top] = num;
		top++;
	}
	
	public void expandTheArr() {
		
		int newStack[] = new int[capacity*2];
		for(int i=0;i<stack.length;i++)
		{
			newStack[i] = stack[i];
		}
		//System.arraycopy(stack, 0, newStack, 0, length); {To copy the contents of array}
		stack = newStack;
		capacity *= 2;
	}

	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		if(top <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void show()
	{
		for(int n : stack) //for-each loop.
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
	
	public int pop()
	{
		int del_data = 0;
		if(isEmpty())
		{
			System.out.println("Underflow : The stack is empty.");
		}
		else
		{
			top--;
			del_data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return del_data;
	}
	
	public void shrink() {
		int length = size();
		if(length <= (capacity/2)/2)
		{
			capacity = capacity/2;
		}
		int newStack[] = new int[capacity];
		for(int i=0;i<newStack.length;i++)
		{
			newStack[i] = stack[i];
		}
		//System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		
	}

	public void peek()
	{
		int peek_data;
		peek_data = stack[top-1];
		System.out.println("Value is : "+peek_data);
	}
}

