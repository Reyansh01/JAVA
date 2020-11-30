import java.util.Scanner;
public class word
{
	int wordcounter(String str, String wor)
	{
		String temp[] = str.split(" ");
		int i,count = 0;
		for(i=0;i<temp.length;i++)
		{
			if(wor.equals(temp[i]))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String wor1 = sc.nextLine();
		word wc = new word();
		int coun = wc.wordcounter(str1,wor1);
		System.out.println("Total number of occurences of this word are : "+coun);
	}
}