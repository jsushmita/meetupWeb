<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create your own meetup</title>
<style type="text/css">
 *{
        margin: 0;
        padding: 5px;
      }
      
 .lg{
  margin: 10px;
  font-weight: 700
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
	padding-left: 112px;
	padding-top: 10px;
	
}
</style>
</head>
<body>
 <table id="tb"><form action="./createMeetup" method="post">
 <tr><td class="lg">Name of the event:</td><td><input type="text" name="mname" placeholder="Give Username.."></td></tr>
 <tr><td class="lg">Type:</td><td><input type="text" name="type" class="desc"></td></tr> 
 <tr><td class="lg">City:</td><td><input type="text" name="city" placeholder="city.." ></td></tr>
 <tr><td class="lg">Your mobile Number:</td><td><input type="text" name="mobno" placeholder="Give mobileno.."></td></tr>
  <tr><td class="lg">Description:</td><td><input type="text" name="desc" placeholder="Write something about the meetup..."></td></tr>
  <tr><td class="lg">Date of event :</td><td><input type="date" name="date"></td></tr>
  <tr colspan=2><span id="Errormsg"></span></tr>
 <tr><td class="loginHead" colspan="2"><input type="Submit" value="CREATE!"></td></tr>
 </form></table>
</body>
</html>