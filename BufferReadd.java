//Program to understand read() method in BufferedReader class.
import java.io.*;
public class BufferReadd
{
	public static void main(String[] args)	throws IOException
	{
		FileReader fr = new FileReader("./read.txt");
		BufferedReader br = new BufferedReader(fr);
		char[] s = new char[20];
		br.read(s,2,8);
		System.out.println(s);
		br.close();
	}
}