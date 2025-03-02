package com.saad;
import java.sql.*;
class TestConnection{
	private Connection cn=null;
	private Statement st=null;
    private PreparedStatement ps=null;
	private ResultSet rs=null;
	private String selectsql="select * from product";
	private String insertsql="insert into product values(?,?,?,?)";
	private String deletesql="delete from product where pid=?";
	private String updatesql="update product set pname=?,pqty=?,price=? where pid=?";
	public void UpdateData() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","885522");
		ps=cn.prepareStatement(updatesql);
		ps.setString(1,"DISH WASHER");
		ps.setInt(2,1);
		ps.setDouble(3, 15000);
		ps.setString(4,"P3");
		ps.executeUpdate();
		}
		
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void deleteData() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","885522");
		ps=cn.prepareStatement(deletesql);
		ps.setString(1,"P1");
		ps.executeUpdate();
		}
		
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	public void addData() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","885522");
		ps=cn.prepareStatement(insertsql);
		ps.setString(1,"P3");
		ps.setString(2,"REFRIGERATOR");
		ps.setInt(3, 1);
		ps.setDouble(4,2700.00);
		ps.executeUpdate();
		}
		
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
	public void getData() {
		try {
//		Class.forName("com.mysql.cj.jdbc.Driver");  // register and load jdbc driver.
//		cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/aecdbst","root","885522");
		ConnnectionFactory con = new ConnnectionFactory();
		cn=con.getConn();
		st=cn.createStatement(); //CReate the statement
		rs=st.executeQuery(selectsql); //Execute the query and store the value into
		while(rs.next()) {
			
//			System.out.println(rs.getString(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getDouble(4));
          System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getDouble(4));

		}
		
		}
		
//		catch(ClassNotFoundException ce) {
//			ce.printStackTrace();
//		}
		
		catch(SQLException se) {
			se.printStackTrace();
		}
	}
}

public class JavaMysqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConnection ts= new TestConnection();
		//ts.addData();
		//ts.deleteData();
		ts.UpdateData();
		ts.getData();

	}

}
