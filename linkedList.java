import java.util.*;
public class linkedList
{
	public static void main(String[] args)
	{
		LinkedList ll = new LinkedList();
		ll.addFirst("Java1");
		ll.addLast("Java3");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.add(1,"Java2");
		System.out.println(ll.get(1));
	}
}