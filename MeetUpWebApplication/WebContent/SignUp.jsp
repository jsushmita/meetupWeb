<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up</title>
<script type="text/javascript">
function checkOnPassword(){
  var p1=document.getElementById("pwd1").value;
  var p2=document.getElementById("pwd2").value;
  if(p1 === p2 )
	  {
	    document.getElementById("Errormsg").innerHTML="Passwords match";
	  }
  else
	  document.getElementById("Errormsg").innerHTML="Passwords do not match";
}
</script>
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
 <table id="tb"><form action="./SignUpValidate" method="post">
 <tr><td class="lg">Name:</td><td><input type="text" name="uname" placeholder="Give Username.." required></td></tr>
  <tr><td class="lg">Age:</td><td><input type="text" name="age" required></td></tr>
 <tr><td class="lg">Address:</td><td><input type="text" name="address" placeholder="Address.." class="desc" required></td></tr> 
 <tr><td class="lg">City:</td><td><input type="text" name="city" placeholder="city.." required></td></tr>
 <tr><td class="lg">Mobile Number:</td><td><input type="text" name="mobno" placeholder="Give mobileno.." required></td></tr>
  <tr><td class="lg">Password:</td><td><input type="password" name="pwd1" placeholder="password.." required></td></tr>
  <tr><td class="lg">Confirm Password:</td><td><input type="password" name="pwd2" placeholder="confirm password.." onkeypress="checkOnPassword()" required></td></tr>
  <tr colspan=2><span id="Errormsg"></span></tr>
 <tr><td class="loginHead" colspan="2"><input type="Submit" value="SIGNUP"></td></tr>
 </form></table>
 
</body>
</html>