package testconnection;
import java.sql.*;
public class TestConnection {
	public static void main(String[] args)
	{
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfully");
			Connection con = DriverManager.getConnection(url,"SYSTEM","rey17");
			System.out.println("Connection established");
			//Work related to all this.
			
			con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Class Not Found");
		}
		catch(SQLException s)
		{
			System.out.println("Connection Failed.");
		}
	}
}
