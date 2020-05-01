import java.util.*;
class Other
{
	public void Hello()
	{
		System.out.println("Hello World");
	}
}

class Another
{
	Other an = new Other()
	{
		public void Hello()
		{
			System.out.println("Hello Everyone.");
		}
	};
}

public class Anonymous
{
	public static void main(String[] args)
	{
		Another ano = new Another();
		ano.an.Hello();
	}
}