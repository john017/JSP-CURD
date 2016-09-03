package aaa;
import java.io.*;
import java.sql.*;
public class connect {
	public Connection con;
	public String url="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=CURD_test";
	public String user="sa";
	public String password="sa";
	public String Message;
	public Statement stmt;
	public ResultSet rs;
	public boolean connection(){
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(ClassNotFoundException ex){
			Message=ex.getMessage();
			return false;
		}
	try{
		con=DriverManager.getConnection(url,user,password);
		return true;
	}
	catch(SQLException ex){
		Message=ex.getMessage();
		System.out.println(Message);
		return false;
	}
	}
	
	public boolean close(){
		try{
			rs.close();
			stmt.close();
			con.close();
			return true;
		}
		catch(Exception ex){
			Message=ex.getMessage();
			return false;
		}
	}
	
	public ResultSet SearchSQL(String sqlstr){
		try{
			connection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(sqlstr);
			return rs;
		}
		catch(Exception ex){
			Message=ex.getMessage();
		}
		return null;
	}
	
	public boolean executeSQL(String str){
		try{
			connection();
			stmt=con.createStatement();
			stmt.executeUpdate(str);
			close();
			return true;
		}
		catch(Exception ex){
			Message=ex.getMessage();
			return false;
		}
	}
}
