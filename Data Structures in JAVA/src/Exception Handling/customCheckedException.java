/* 2 ways to throw custom exceptions:
1. Checked exception (Compile time exception)  --> Exception class is extended.
2. Unchecked exception (Run time exception) --> RuntimeException class is extended.
*/

class checkedException extends Exception {
	customException() {
		super("This is a custom exception..");
	}
	
	customException(String message) {
		super(message);
	}
}

/* In case of checked exception either we use try catch block or give declaration of throws keyword. */
public class customCheckedException {
	/* 1. use throws keyword..
	public static void main(String[] args) throws customException */
	
	//2. use try catch block..
	public static void main(String[] args) throws customException{
		int cust = 10;
		try {
			if(cust < 10) {
				/* if we want to use custom message.
				throw new checkedException("This is custom message"); */
				throw new checkedException();
			}
			else {
				System.out.println("No exception..");
			}
		} catch(customException e) {
			e.printStackTrace();
		}
	}
}
