<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile Inforamation</title>
</head>
<style type="text/css">

.disply{  
  background-color: lightgrey;
  width: 700px;
  border: 5px solid black;
  padding: 25px;
  margin: 5px;
  height:300px;
  }
  </style>
<body>

<div class="disply">
<%String fname=(String)application.getAttribute("fullName"); %>
<h2 >Name         : <%=fname %></h2>

<%String mailId=(String)application.getAttribute("mailId"); %>
<h2 >Email        :<%=mailId %></h2>

<%String mobNum=(String)application.getAttribute("mobileNumber");%>
<h2 >Mobile Number: <%=mobNum %></h2>

<%String dob=(String)application.getAttribute("dateOfBirth"); %>
<h2 >Date of birth: <%=dob %></h2>

<%String gender=(String)application.getAttribute("gender"); %>
<h2 >Gender       : <%=gender %></h2>

<%String address=(String)application.getAttribute("address"); %>
<h2 >Address      :<%=address %></h2>
</div>
</body>
</html>