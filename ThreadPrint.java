import java.util.*;
class Thread2 implements Runnable
{
	public void run()
	{
		int j;
		for(j=0;j<=50;j++)
		{
			if(j%2!=0)
			{
				System.out.println("Odd number : "+j);
			}
			else
			{
				System.out.println("Even Number : "+j);
			}
		}	
	}
}
public class ThreadPrint
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Thread2());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		t2.start();
	}
}