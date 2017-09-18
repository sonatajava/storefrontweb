<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href='//fonts.googleapis.com/css?family=Freckle Face'
	rel='stylesheet'>
<style>
.navbar-brand {
	font-family: 'Freckle Face';
	font-size: 55px;
}

li::-ms-expand {
    display: none;
}
</style>
</head>

<body>

	

	<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" style="color: #000080" href="${pageContext.request.contextPath}/CustomerServlet">MARKETBLUES </a>
		</div>

		
		<ul class="nav navbar-nav navbar-right" style="font-size: 16px">
			<li class="divider-vertical"></li>

			<li><a href="cart" style="color: navy"><span
					class="glyphicon glyphicon-shopping-cart" style="color: navy"></span>CART
					(${cartSize}) </a></li>


			<li><a style="color: navy; margin: 0px 0px 0px 0px"
				href="logout"> <span class="glyphicon glyphicon-log-out"></span>
					Log Out
			</a></li>


			<li><a style="color: navy; margin: 0px 0px 0px 0px" href="${pageContext.request.contextPath}/LoginServlet"><span
					class="glyphicon glyphicon-log-in"></span> Log In</a></li>
			<li><a style="color: navy; margin: 0px 0px 0px 0px"
				href="${pageContext.request.contextPath}/RegistrationServlet""><span class="glyphicon glyphicon-user"></span>
					Sign Up</a></li>
         </ul>
	</div>
	</nav>
		<nav class="navbar navbar-toggler">
	<div class="container-fluid">
            <ul class="nav navbar-nav" style="font-size: 20px">
			<c:forEach items="${catList}" var="category">
				<li><a href="${pageContext.request.contextPath}/ProductServlet?vName=${category.c_name}" style="color: #000080" ">${category.c_name}<span
						class="caret"></span>
				</a> </li>
			</c:forEach>
		</ul>
    </div>
    </nav>
</body>
</html>