import java.util.*;
public class vector
{
	public static void main(String[] args)
	{
		Vector vr = new Vector(5);
		vr.addElement("Java1");
		vr.addElement("Java2");
		vr.addElement("Java3");
		System.out.println(vr);
		
		Enumeration er = vr.elements();
		while(er.hasMoreElements())
		{
			String s = (String) er.nextElement();
			System.out.println(s);
		} 
	}
}