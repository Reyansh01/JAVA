import java.io.*;
public class FileInput
{
	public static void main(String[] args) throws IOException
	{
		int i;
		FileInputStream fis = new FileInputStream("./filehandling.txt");
		//since java does not has any EOF like in c++, so we use do-while loop.
		do
		{
			i = fis.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
		}while(i!=-1);
		fis.close();
	}
}