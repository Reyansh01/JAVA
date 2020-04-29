import java.io.*;
public class Buffer
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("./filehandling.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Buffer Writer Class in File Handling");
		bw.close();
	}
}