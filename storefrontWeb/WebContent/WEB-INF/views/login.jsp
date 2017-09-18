<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Login page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>    
	<div align="center">

		<h1>Login Page</h1>
		<form name="login" method="post" action="LoginBeanServlet">
			<label>User Name</label> <input type="text" size="15" name="user"
				required /><br /> <br /> <label>Password</label> <input
				type="password" size="15" name="password" /><br /> <br /> 
				<input type="submit" value="login"/><br/>
				<a href="${pageContext.request.contextPath}/ChangeServlet">Change Password</a>
				<a href="${pageContext.request.contextPath}/ForgotServlet">Forgot Password</a>
		</form>		

	</div>
	<br>
	<br>
	<br>
	<br>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>

</html>