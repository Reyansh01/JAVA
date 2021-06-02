package DynamicSizedStack;

//Dynamic Sized stack.
public class Main {

	public static void main(String[] args) {
		
		DynamicStack ds = new DynamicStack();
		
		System.out.println("Example for expanding.");
		ds.push(2);
		ds.push(3);
		ds.show();
		System.out.println("Size is : "+ds.size());
		ds.push(4);
		ds.push(5);
		ds.show();
		System.out.println("Size is : "+ds.size());
		ds.push(6);
		ds.show();
		System.out.println("Size is : "+ds.size());
		
		System.out.println("Example for shrinking.");
		ds.pop();
		ds.show();
		System.out.println("Size is : "+ds.size());

		ds.pop();
		ds.show();
		System.out.println("Size is : "+ds.size());

		ds.pop();
		ds.show();
		System.out.println("Size is : "+ds.size());
		
		ds.pop();
		ds.show();
		System.out.println("Size is : "+ds.size());
		
		ds.pop();
		ds.show();
		System.out.println("Size is : "+ds.size());

	}

}
