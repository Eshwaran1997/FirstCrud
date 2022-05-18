package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestB {
	public static void main(String[] args) {
		
	
	String url= "jdbc:mysql://localhost:3306/javabatch";
	String user ="root";
	String pwd ="root";
	String sql ="insert into product values(4,'cintol','hamam','soap',50)";
	try {
		
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con =DriverManager.getConnection(url, user, pwd);
	Statement s =con.createStatement();
	s.execute(sql);
	con.close();
	
	System.out.println(con);
	System.out.println(s);
	
	}
	catch(ClassNotFoundException e )
	{
		e.printStackTrace();
	}
	catch(SQLException s)
	{
		
		s.printStackTrace();
	}
	
	
	
	}
}
