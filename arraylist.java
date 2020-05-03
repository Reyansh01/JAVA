import java.util.*;
public class arraylist
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList(4);
		al.add("java1");
		System.out.println(al);
		ArrayList al1 = new ArrayList(3);
		al1.add("java2");
		al1.add("java3");
		al.addAll(al1);
		System.out.println(al);
		al.remove("java1");
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
	}
}