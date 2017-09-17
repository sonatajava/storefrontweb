<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<div align="center">
<body>
    <h1>Login Page</h1>
   <form name="login" method="post">
     <label>User Name</label> <input type="text" size="15" name="user" required/><br/><br/>
     <label>Password</label> <input type="password" size="15" name="password"/><br/><br/>
     <input type="submit" value="login" onsubmit="LoginBeanServlet"/> <input type="submit" value="forgot password" onsubmit="ForgotBeanServlet"/>
    </form> 
 </div>   
</body>
</html>