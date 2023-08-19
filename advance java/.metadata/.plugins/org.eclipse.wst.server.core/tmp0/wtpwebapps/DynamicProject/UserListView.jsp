<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<from action="">
					<%@ include file="Header.jsp"  %>
					
					<% 
					List List = (List) request.getAttribute("list");
					
					Iterator it = List.iterator();
					
					%>
					<table border="1">
						<tr>
							<th>Id</th>
							<th>FirstName</th>
							<th>LastName</th>
							<th>LoginId</th>
							<th>Password</th>
							<th>Dob</th>
							<th>Address</th>
						</tr>
							<%
								while(it.hasNext()){
									
									bean = (UserBean)it.next();
								
							%>
						<tr>
							<td><%=bean.getId()%></td>
							<td><%=bean.getFist_name()%></td>
							<td><%=bean.getLast_name()%></td>
							<td><%=bean.getLogin_id()%></td>
							<td><%=bean.getPassword()%></td>
							<td><%=bean.getDob()%></td>
							<td><%=bean.getAddress()%></td>
							
							<%
								}
							%>
						</tr>
					
					</table>
									
				</from>

</body>
</html>