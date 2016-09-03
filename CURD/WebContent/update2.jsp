<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="aaa.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
execute exe=new execute();
String str=request.getParameter("string");
int id=Integer.parseInt(request.getParameter("id"));
exe.update(str, id);
response.sendRedirect("NewFile.jsp");
%>
</body>
</html>