import java.util.*;
public class hashSet
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet(); //By default Capacity = 16 and load factor = 0.75
		hs.add("Java1");
		hs.add("Java2");
		hs.add("Java3");
		hs.add("Java1");
		System.out.println(hs);
	}
}