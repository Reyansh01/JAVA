import java.util.*;
public class ArraylistIterator
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList(5);
		al.add("java1");
		al.add("java2");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}