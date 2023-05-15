package employee_management;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
  Connection conn;
  Statement s;
	public  DB() {
		try {Class.forName("com.mysql.cj.jdbc.Driver");
//			String url="jdbc:mysql://localhost:3306/Employeemanagementsystem";
//			String userName="root";
//			String password="1234";
//			
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeemanagementsystem1","root","1234");
		s= conn.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
