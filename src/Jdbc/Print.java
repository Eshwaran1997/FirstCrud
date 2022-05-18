package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Print {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String user="root";
		String pwd ="root";
		String sql = "insert into user values(15,'vinay','vinichikki@','blue',97690)";
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url,user, pwd);
		Statement s =con.createStatement();
		
		ResultSet rs =s.execute(sql);
		while()
		con.close();
		System.out.println(sql);
		System.out.println(s);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

	
	
	
	


