import java.io.*;
public class BufferReader
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileReader fr = new FileReader("./filehandling.txt");
		BufferedReader br = new BufferedReader(fr);
		while((i = br.read())!=-1)
		{
			System.out.print((char)i);
		}
		br.close();
	}
}