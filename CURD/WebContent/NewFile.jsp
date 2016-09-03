<%@page import="java.util.function.Function"%>
<%@page import="aaa.*,java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>   
<jsp:useBean id="execute" scope="page" class="aaa.execute"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="insert.jsp">
<label>内容：</label>
<input name=string type=text/>
<input type=submit value="添加"/>
<p></p>
</form>
<%
	execute exe=new execute();
	ResultSet rs=exe.search();
%>
<table>
<tr>
<td>内容</td><td>ID</td>
</tr>
<%
int id=0;
if(rs!=null)
	while(rs.next())
	{ 
		id=rs.getInt("id");
%>
<tr>
<td><%=rs.getString("string")%></td>
<td><%=id%></td>
<td><a href="update.jsp?id=<%=id%>">修改</a></td>
<td><a href="delete.jsp?id=<%=id%>">删除</a></td>	
</tr>
<%
	}else
		System.out.println("NULL");

%>
</table>
</body>
</html>