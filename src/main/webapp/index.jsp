<html>
<head>
	<link rel="stylesheet"  type="text/css" href="style.css">
</head>
<body>
<% 
	String errorMsg = request.getParameter("errorMsg");
	if(errorMsg != null)
	{
		out.println("ERROR" + "=>" + errorMsg);
	}
%>
<div class="box">
	<h3>User Login</h3>
	<form action="LoginServlet" method="get">
		<div class="p-10">
			Email
		</div>
		<div class="p-10">
			<input type="email" name="email" placeholder="email" required  autofocus />
		</div>
		<div class="p-10">
			Password
		</div>
		<div class="p-10">
			<input type="password" name="password" placeholder="password" required />
		</div>
		<div class="p-10">
			<button type="submit">Login</button>
		</div>
	</form>
	</div>
</body>
</html>
