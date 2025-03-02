package com.saad;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnnectionFactory {
Connection cn=null;
public Connection getConn() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");  // register and load jdbc driver.
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","885522");
		 
		}
			
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
	return  cn;
}

}
