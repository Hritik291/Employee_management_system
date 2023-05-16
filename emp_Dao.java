package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
public class emp_Dao {

		static Connection con;
		public static Connection Datac() {

		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		String user="root";
		String password="Amitkumar@789";
		String url="jdbc:mysql://localhost:3306/ems";
		con=DriverManager.getConnection(url,user,password);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
		
	}

