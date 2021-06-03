public class throwThrowsKeyword {
	public static void main(Strin[] args) {
		fun1();
	}

	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b;
		
		System.out.println(c);
		try {
			fun2();
		} catch(Exception e) {
			System.out.println(e.getMessage() + " has occurred..");
		}
	}

	static void fun2() throws ArrayIndexOutOfBoundsException {
		boolean danger = true;
		if(danger) {
			throw new ArrayIndexOutOfBoundsException("danger! danger! danger!");
		}
	}
}