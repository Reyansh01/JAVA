/* In unchecked exception program will compile without using try catch block or throws keyword.
But in case of checked it is mandatory to use try catch block along with throws keyword to compile the program.
In unchecked exception program will compile but it will terminate as soon as it gets an exception during runtime.
i.e exception would not be handled (for example, if we write hello below the line where exception is thrown
then that hello would not be printed). So for that we need to use try catch block.
*/

public class uncheckedException extends RuntimeException {
	uncheckedException() {
		super("This is unchecked exception..");
	}
	
	uncheckedException(String message) {
		super(message);
	}
}

public class customUncheckedException {
	public static void main(String[] args) {
		int a = 10;
		try {
			if(a<10) {
				throw new uncheckedException();
			}
			else {
				System.out.println(a);
			}
		} catch(uncheckedException e) {
			e.printStackTrace();
		}
	}
}