import java.io.*;
public class BufferRead
{
	public static void main(String[] args) throws IOException
	{
		String s;
		FileReader fr = new FileReader("./read.txt");
		BufferedReader br = new BufferedReader(fr);
		while((s = br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();
	}
}