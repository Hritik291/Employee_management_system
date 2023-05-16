package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DB {
			static Connection co;
			public static Connection Datac() {

			try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String user="root";
			String password="Amitkumar@789";
			String url="jdbc:mysql://localhost:3306/Employeemanagementsystem1";
			co=DriverManager.getConnection(url,user,password);
//			System.out.println("Hello");
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return co;
		}
//			public static void main(String[]args) {
//				DB a=new DB();
//				a.Datac();
//				
//				
//			}
		}


