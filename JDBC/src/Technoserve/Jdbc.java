package Technoserve;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Jdbc 
{
private static final String DriverManeger = null;

public static void main(String[] args) throws Exception
{
	String url ="jdbc:mysql://localhost:3306/student ";
	String user="poonam";
	String pass="root";
	String query ="SELECT * FROM student.stud details;";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,user,pass) ;
	Statement st = con.createStatement();
	ResultSet rs =st.executeQuery(query);
	rs.next();
	System.out.println("id of the student is "+rs.getInt(1));
	System.out.println("id of the student is "+rs.getString(2));
	st.close();
	con.close();

	
	
}
}
