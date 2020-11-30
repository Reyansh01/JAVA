class Thread1 implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=10;i++)
		{
			System.out.println("Thread 1 is running : "+i);
		}
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		int j;
		for(j=0;j<=10;j++)
		{
			System.out.println("Thread 2 is running : "+j);
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		t1.start();
		t2.start(); 
	}
}