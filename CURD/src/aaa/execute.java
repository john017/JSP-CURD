package aaa;
import java.io.*;
import java.sql.*;

public class execute {
	public connect conn=new connect();
	public boolean adds(String str){
		try{
			System.out.println("A~");
			String sqlstr="insert into [table](string)values('"+str+"')";
			conn.executeSQL(sqlstr);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	public boolean remove(int id){
		try{
			String sqlstr="delete from [table] where id="+id;
			conn.executeSQL(sqlstr);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	public boolean update(String str,int id){
		try{
			String sqlstr="update [table] set string='"+str+"' where id="+id;
			conn.executeSQL(sqlstr);
			return true;
		}
		catch(Exception ex){
			return false;
		}
	}
	public ResultSet search(){
		try{
			String sqlstr="select * from [table]";
			ResultSet rs=conn.SearchSQL(sqlstr);
			if(rs!=null)
			System.out.println("S~");
			return rs;
		}
		catch(Exception ex){
			return null;
		}
	}
	public int test(){
		return 6;
	}
}
