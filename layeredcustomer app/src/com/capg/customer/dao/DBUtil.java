package com.capg.customer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
static Connection conn = null;
public static Connection getDBConnection() {
	try
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		System.out.println(conn);
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return conn;
}


}

