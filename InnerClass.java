import java.util.*;
class Outer
{
	class Inner
	{
		void Hello()
		{
			System.out.println("Hello, This is non static Inner Class. ");
		}
	}
}

public class InnerClass
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.Hello();
	}
}