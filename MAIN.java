
import java.util.*;

//user defined Exception..!
class NameException extends Exception
{
	public NameException(String s)
	{
		super(s);   //Passing String s to Parent Class..! 
	}
}


//user defined Exception..!
class WrongException extends Exception
{
	public WrongException(String s)
	{
		super(s);
	}
}



@FunctionalInterface
interface Date
{
	void examdates(String date);
}


interface studMethods
{
	void getDetails();     // If nothing is mentioned these methods in interface are public and abstract.
	void showDetails();
	void fee(String choose);
}


interface Methods extends studMethods
{
	void faculty();
	void display();
}


interface Percent
{
	Double percentage();  //add function.
}

abstract class Student implements Methods  //Since i'm not implementing all the methods of the interface that's why i've declared it as abstract class..!
{
	protected int SapID;
	protected String name; 
	protected String RollNo;
	abstract public void display();
	
	@Override
	public void getDetails()
	{
		int SapID;
		String name, RollNo;
		System.out.print("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		
		
		//To check whether user gave an input of name or not.!		
		try
		{
			this.name = sc.nextLine();
			if(!(this.name.matches("[A-Z]|[a-z]+"))) throw new NameException("Name of the Student cannot be a number");	   //java regular expression..!
		}
		catch(NameException ne)
		{
			System.out.println(ne.getMessage());
		}


		
		System.out.print("Enter your RollNo : ");

		
		//RollNo should start with letter r or R ONLY..!
		try
		{
			this.RollNo = sc.nextLine();
			if(!(this.RollNo.matches("(^[r|R])([a-zA-Z0-9]*)"))) throw new WrongException("Your Roll Number should start with the letter r or R only");
		}
		catch(WrongException we)
		{
			System.out.println(we.getMessage());
		}



		System.out.print("Enter your Sap ID : ");

		try
		{		
			this.SapID = sc.nextInt();
		}
		catch(InputMismatchException im)
		{
			System.out.println("You've entered invalid Sap ID.");
			sc.nextLine();
		}
	}	
	


	@Override	
	public void showDetails()
	{
		System.out.println("Hello "+name.toUpperCase());
		System.out.println("Your Rollno is : "+RollNo);
		System.out.println("Your Sap ID is : "+SapID);
	}



	
	@Override
	public void fee(String choose)
	{
		if(choose.equalsIgnoreCase("yes"))
		{
			//Fees cannot be changed further..!
			
			final float fees;
			
			//initialization block.
			{
				fees = 156070.50f;
				System.out.print("Your fees for this semester is : "+fees);
			}
		}
		else
		{
			System.out.println("Fees is not updated for any other semester as of now. ");
		}
		System.out.println();
	}
	

	@Override
	public void faculty()
	{
		System.out.println("   "+name.toUpperCase() + "  Your faculties would be : ");	
		System.out.println("1. Data Communication and Networking           :     Mr.Anupam Singh ");
		System.out.println("2. Object Oriented Programming                 :     Mr.Shiv Naresh ");
		System.out.println("3. Software Engineering and project Management :     Mrs.Apurva Gupta ");
		System.out.println("4. Big Data Analysis                           :     Mr.Deepak Kumar Sharma ");
		System.out.println("5. Big Data Ingestion                          :     Mr.Hukum Singh Rana ");
	}
	
}




class Teacher extends Student
{
	String department;
	public void display()
	{
	}
	
	@Override
	public void getDetails()
	{
		System.out.print("Please Enter your name sir : ");
		Scanner sc = new Scanner(System.in);
		
		
		//To check whether user gave an input of name or not.!		
		try
		{
			this.name = sc.nextLine();
			if(!(this.name.matches("[A-Z]|[a-z]+"))) throw new NameException("Name of the Student cannot be a number");	   //java regular expression..!
		}
		catch(NameException ne)
		{
			System.out.println(ne.getMessage());
		}
		System.out.print("Enter your department : ");
		department = sc.nextLine();
		System.out.println();
	}

	@Override
	public void showDetails()
	{
		System.out.println("Hello : "+name.toUpperCase());
		System.out.println("You are from "+department+" department");
	}


	
	//NESTED CLASS..!

	class Marks implements Percent
	{
		public Double percentage()
		{
			Double p;
			Double s1,s2,s3,s4,s5;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the marks of student to calculate the percentage : ");
			System.out.print("1. DCN : ");
			s1 = sc.nextDouble();
			System.out.print("2. SEPM : ");
			s2 = sc.nextDouble();
			System.out.print("3. OOPS : ");
			s3 = sc.nextDouble();
			System.out.print("4. BDA : ");
			s4 = sc.nextDouble();
			System.out.print("5. BDI : ");
			s5 = sc.nextDouble();
			p = ((s1+s2+s3+s4+s5)/500)*100;
			return p;
		}
	}
}



class Hostel extends Student implements Methods
{
	@Override
	public void showDetails()
	{
		System.out.println("Details of the student for Hostel are : ");	
	}



	public void edit(String pref)
	{
		if(pref.equalsIgnoreCase("Yes"))
		{
			super.getDetails();
			System.out.println("Your details have been modified..");
			super.showDetails();
		}
	}
	


	@Override
	public void display()
	{
		String loc;
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(" "+name.toUpperCase()+" Your Roll Number is : "+RollNo+" and your Sap ID is : "+SapID);

		System.out.print("Do you want to opt for 'bidholi' campus hostel or 'kandoli' campus hostel ? : ");
		loc = sc.nextLine();
		

		if(loc.equalsIgnoreCase("kandoli"))
		{
			//used Random class to generate random number..!
			
			Random rom = new Random();
			System.out.println("Ther are a total of "+rom.nextInt(60)+" rooms available in kandoli campus. ");
			System.out.println();
		}
		else
		{
			Random rom = new Random();
			System.out.println("There are a total of "+rom.nextInt(100)+" rooms available in Bidholi campus. ");
			System.out.println();
		}
	}
}




public class  MAIN
{
	public static void main(String[] args)
	{
		String maininput;
		System.out.print("Enter whether you are a 'student' or a 'teacher' : ");
		Scanner sc = new Scanner(System.in);
		maininput = sc.nextLine();

		if(maininput.equalsIgnoreCase("student"))
		{
			
			//Keeping the object in reference variable of Interface.
			Methods stud = new Hostel();
			stud.getDetails();
			stud.showDetails();
		
			//LAMBDA expression.
			Date da = (date)->{
			if(date.equals("mid-sem"))
			{
				System.out.println("DCN      :       19 March 2020");
				System.out.println("OOPS     :       21 March 2020");
				System.out.println("SEPM     :       24 March 2020");
				System.out.println("BDA      :       26 March 2020");
				System.out.println("BDI      :       27 March 2020");
			}
			else
			{
				System.out.println("You'll be notified as soon as the date sheet is released for end-sem.");
			}
		};
			while(true)
			{
				System.out.println();
				System.out.println("Do you want to see any more information out of these? ");
				System.out.println("1. Fees ");
				System.out.println("2. Faculty ");
				System.out.println("3. Exam dates : ");
				System.out.println("4. Hostel : ");
				System.out.println("5. Edit your details : ");
				int choice;
				choice = sc.nextInt();
				sc.nextLine();
				System.out.println();
				switch(choice)
				{
					case 1 :	String choose;
							System.out.print("Do you want to see fees for this semester : ");
							choose = sc.nextLine();	
							stud.fee(choose);
							break;
					
					case 2 :	stud.faculty();
							break;
					
					case 3 : 	System.out.print("Do you want to get date sheet of 'mid-sem' or 'end-sem' ");
							String date;
							date = sc.nextLine(); 
							da.examdates(date);
							break;

					case 4 :	stud.display();
							break;

					case 5 :	System.out.println("Do you want to edit Student details ? : ");
							String pref;
							pref = sc.nextLine();
							Hostel hos = new Hostel();
							hos.edit(pref);
							break;

					default : 	System.out.println("Invalid Input");
							return;
				}
			}
		}
		else
		{
			Teacher teach = new Teacher();
			teach.getDetails();
			teach.showDetails();
			Double per;
			
			//Nested class's object..!
			Teacher.Marks mark = teach.new Marks();
			per = mark.percentage();
			System.out.println("Percentage of the student is : "+per);
		}
	}
}
