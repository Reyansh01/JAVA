import java.io.*;
public class FileHandling
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("./filehandling.txt",true);
		String s = "My First File Handling Program.";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			fos.write(ch[i]);	
		}
		fos.close();	
	}
}