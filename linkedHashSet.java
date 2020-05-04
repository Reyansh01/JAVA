import java.util.*;
//LinkedHashSet has doubly linked list pointers. 
// order is preserved in this but not in HashSet.
public class linkedHashSet
{
	public static void main(String[] args)
	{
		LinkedHashSet lhs = new LinkedHashSet(); //By default Capacity = 16 and load factor = 0.75
		lhs.add("Java1");
		lhs.add("Java2");
		lhs.add("Java3");
		lhs.add("Java1");
		System.out.println(lhs);
	}
}