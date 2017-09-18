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
<title>Forgot password</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div align="center">
<h1>Forgot Password</h1>
<form name="form1" method="post" action="ForgotBeanServlet">
<label>UserName</label><input type="text" name="user" size="15"/></br></br>
<label>Select Security Question:</label><select name="securityQuestion">
                           <option value="Your pet's name">Your pet's name</option>
                           <option value="Your Favourite movie">Your Favourite movie</option>
                           <option value="Your hobbie">Your Hobbie</option>
                           <option value="Your favourite book"> Your favourite book</option>
                            </select></br><br/>
<label>Answer</label><input type="text" name="answer" size="25"/><br/><br/>
<label>Enter Password</label><input type="password" name="pwd1" size="20"/><br/><br/>
<label>ReEnter Password</label><input type="password" name="pwd2" size="20"/><br/><br/>
<input type="submit" value="change password"/>
</form>    
</div>          
<jsp:include page="footer.jsp"></jsp:include>             
</body>
</html>