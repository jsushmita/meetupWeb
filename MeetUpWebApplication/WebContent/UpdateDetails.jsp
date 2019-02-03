<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 *{
        margin: 0;
        padding: 5px;
      }
      
 .lg{
  margin: 10px;
 }
 
 #tb{
 margin: 14%;
 margin-left: 37%;
 border-collapse: collapse;
  }
  
  .tb tr{
   margin: 10px;
  }
  
  body {
	background-image: url("bg.jpg");
}

.loginHead{
	padding-left:267px;
	padding-top: 10px;
}
</style>
</head>
<body>
	<table id="tb">
	<form action="./Update" method="post">
 <tr><td class="lg">Detail of the event that you need to edit:</td><td><input type="text" name="col" placeholder="Give name.." required></td></tr>
 <tr><td class="lg">Updated detail</td><td><input type="text" name="detail" placeholder="Give new value" required></td></tr>
 <tr><td class="loginHead" colspan="2"><input type="Submit" value="Edit"></td></tr>
 </form></table>
</body>
</html>