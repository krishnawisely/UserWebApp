<html>
<head>
	<link rel="stylesheet" href="style.css">
</head>
<body>
<h2>Login page</h2>
<% 
		String errorMsg = request.getParameter("errorMsg");
		if(errorMsg != null)
		{
			out.println("ERROR" + "=>" + errorMsg);
		}
	%>
	<form action="LoginServlet" method="get">
		<div>
			Email:<input type="email" name="email" placeholder="email" required  autofocus />
		</div>
		<div>
			Password:<input type="password" name="password" placeholder="password" required />
		</div>
		<button type="submit">Login</button>
	</form>
</body>
</html>
