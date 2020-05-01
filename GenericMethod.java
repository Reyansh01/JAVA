import java.util.*;
public class GenericMethod
{
	public <GM> void print(GM s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args)
	{
		GenericMethod gg = new GenericMethod();
		String java[] = {"java1","java2","java3"};
		Integer number[] = {1,2,3,4,5};
		gg.print(java);
		gg.print(number);
	}
}