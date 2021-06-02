package Stack;

public class Stack {
	
	int stack[] = new int[5];
	int top = 0;
	
	public void push(int num)
	{
		if(top == 5)
		{
			System.out.println("Overflow : Stack is full.");
		}
		else
		{
		stack[top] = num;
		top++;
		}
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
	
	public void pop()
	{
		int del_data;
		if(isEmpty())
		{
			System.out.println("Underflow : The stack is empty.");
		}
		else
		{
			top--;
			del_data = stack[top];
			stack[top] = 0;
			System.out.println("Deleted value is : "+del_data);
		}
	}
	
	public void peek()
	{
		int peek_data;
		peek_data = stack[top-1];
		System.out.println("Value is : "+peek_data);
	}
}
