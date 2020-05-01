import java.util.*;
public class ForEach
{
	public void print(int n[])
	{
		for(int no : n)
		{
			System.out.println(no);
		}
	}
	public static void main(String[] args)
	{
		ForEach fe = new ForEach();
		int num[] = {1,2,3,4,5};
		fe.print(num);
	}
}