<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Registration</title>
</head>
<div align="center" style="margin: 0 auto; text-align:center">
<body align="center">
<h1>Customer Details</h1>
  <form name="f1" method="post" action="CustomerBeanServlet" align="center">
  <label>Enter Customer Id:</label> <input type="number" name="customerId" size="10"required/></br>
 <label> Enter name:</label><input type="text" name="name"  size="20" required/></br>
 <label> Enter User name:</label><input type="text" name="username" size="15" required/></br>
  <label>Enter password:</label><input type="password" name="password" size="20" required/></br>
 
  <label>Select Security Question:</label><select name="securityQuestion">
                           <option value="Your pet's name">Your pet's name</option>
                           <option value="Your Favourite movie">Your Favourite movie</option>
                           <option value="Your hobbie">Your Hobbie</option>
                           <option value="Your favourite book"> Your favourite book</option>
                            </select></br>
  <label>Enter Answer:</label><input type="text" name="answer" size="50" required/></br>
  <label>Enter Email:</label><input type="email" name="email" size="25" required/></br>
  <label>Enter Mobile Number:</label><input type="number" size="10"/ name="mobile" required></br>
  <label>Select Your gender</label> <input type="radio" name="gender"  value="male" required>male
                     <input type="radio" name="gender" value="female" required>Female</br>
                     
 <label> Select your Date of Birth:</label><input type=date name="dateOfBirth" placeholder="dd-mm-yyyy" required/></br>
  </br>
  <h1>Address Details</h1></br>
 <label> Enter Address Id:</label><input type="number" name="addressId" size="10" required/></br>
  <label>Enter your Dno:</label><input type="text" name="dno" size="6" required/></br>
  <label>Enter your Street name:</label><input type="text" name="street" size="25" required/></br>
  <label>Enter your city name:</label><input type="text" name="city" size="20" required/></br>
  <label>Enter your district name:</label><input type="text" name="district" size="20" required/></br>
  <label>Enter your pincode:</label><input type="number" name="pincode" size="6" required/></br>
 <label> Enter your state name:</label><input type="text" name="state" size="20" required/></br>
  
  </br>                   
  <input type="submit" value="submit"/>
  </form>
</body>
</div>
</html>