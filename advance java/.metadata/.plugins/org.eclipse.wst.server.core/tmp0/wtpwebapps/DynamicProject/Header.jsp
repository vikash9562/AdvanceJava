<%@page import="in.co.rays.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		UserBean bean = (UserBean) request.getAttribute("user");
	%>

	<%
		if (bean != null) {
	%>
	<h3>
		Hi,
		<%=bean.getFist_name()%></h3> 
		<a href="UserListCtl" >UserList</a>
		<a href="LoginCtl?operation=logout" >Logout</a>
	<%
		} else {
	%>
	<h3>Hi, Guest</h3>
	<%
		}
	%>
	<hr>

</body>
</html>
