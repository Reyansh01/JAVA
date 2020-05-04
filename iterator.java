import java.util.*;
public class iterator
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList(8);
		for(int i=0;i<8;i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Integer in = (Integer)it.next();
			if(in>2 && in<5)
			{
				it.remove();
			}
		}
		System.out.println(al);
	}
}