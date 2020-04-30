import java.util.*;
class Outer //outer class can only be default or public.
{
	static class Inner
	{
		public void Hello()
		{
			System.out.println("This is Inner Class. ");
		}
	}
}

public class StaticInnerClass
{
	public static void main(String[] args)
	{
		Outer.Inner in = new Outer.Inner();
		in.Hello();
	} 
}