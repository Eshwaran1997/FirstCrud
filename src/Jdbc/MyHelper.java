package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyHelper {
	private String url="jdbcc:mysql://localhost:3306/javabatch";
	private String user ="root";
	private String password ="root";
	private Connection con =null;
	
	public Connection getConnection() {
		//String sql ="delete from student where id=1";
		try {
			Class .forName("com.mysql.cj.jdbc.Driver");//1 register driver
		 Connection con =DriverManager.getConnection(url, user, password);//2 establishing connection
		 
		Statement s= con.createStatement();//3establish statement
		s.execute(sql);//4 execute query
		con.close();
		 
		 System.out.println(con);
		 System.out.println("s");
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
	}
	

}
