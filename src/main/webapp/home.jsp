<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h3>Welcome to dash board</h3>
	<% 
		String userName = request.getParameter("username");
		if(userName != null)
		{
			out.println("welcom" + " " + userName);
		}
	%>
</body>
</html>