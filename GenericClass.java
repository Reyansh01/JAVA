import java.util.*;
public class GenericClass<GC>
{
	GC i;
	public void store(GC i)
	{
		this.i = i;	
	}
	
	public static void main(String[] args)
	{
		GenericClass<Integer> gc1 = new GenericClass<Integer>();
		GenericClass<String> gc2 = new GenericClass<String>();
		Integer num = 10;
		String name = "Java";
		gc1.store(num);
		gc2.store(name);
		System.out.println("number is : "+num+" and name is : "+name);
	}
}