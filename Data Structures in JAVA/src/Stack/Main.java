package Stack;
// Fixed Size Array !!
public class Main {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		
		stack.show();
		
		stack.peek();
		int si = stack.size();
		System.out.println("Size is : "+si);
		
		stack.isEmpty();
		
		stack.pop();
		
		stack.show();
		stack.pop();
		stack.pop();
		
		stack.isEmpty();
		
		int s = stack.size();
		System.out.println("size is : "+s);
		
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.show();
		stack.push(70);
		stack.show();
		
		stack.isEmpty();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

	}

}
