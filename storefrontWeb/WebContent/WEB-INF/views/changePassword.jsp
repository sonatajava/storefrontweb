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
<title>Change password</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>  
<br>
<br>
<br>
  
<div align="center">
   <h1>Change password</h1>
   <form name="f2" method="post" action="ChangeBeanServlet">
 <label>User Name</label>  <input type="text" name="user" size="15"/></br></br>
 <label>Old Password</label><input type="password" name="old" size="15"/></br></br>
 <label>Password</label><input type="password" name="pwd1" size="20"/></br> </br> 
 <label>Re enter Password</label><input type="password" name="pwd2" size="20"/>  </br></br>
  <input type="submit" value="change Password"/> 
   </form>
 </div>  
 <br>
 <br>
 <br>
 <jsp:include page="footer.jsp"></jsp:include>    
</body>
</html>