<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome to jsp* bank</title>
</head>
<body>
<style type="text/css">
body{background:url("success.jpg") no-repeat center fixed  ;
     background-size: cover;}
.welcome{
         width:1525px;
         height:30px;
         padding-top:2px;
         padding-bottom:20px;
         text-align:center;
         background-color:blue;
         color:white;
         }
 .main{float: right}
 ul{float:left;
   list-style-type: none;
   margin: 20px;
   }
ul li{display: inline-block;margin: 10px 5px}
ul li a{text-decoration: none;
        padding: 8px 20px;
        letter-spacing: 2px;
        color:white;
        border-bottom: 1px splid #272727;
        background: red;
        }
ul li a:hover{background-color:#ff3c54}

.dropbtn {

  background-color: #4CAF50;
  color: white;
  padding: 7px 50px;
  font-size: 16px;
  border: none;
}

.dropdown {
  
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
}

.dropdown-content a:hover {background-color: #ddd;}

.dropdown:hover .dropdown-content {display: block;}

.dropdown:hover .dropbtn {background-color:red;}
.disply{  
  background-color: lightgrey;
  width: 400px;
  border: 5px solid green;
  padding: 25px;
  margin: 2px;
  height:320px;
  }
  .offers{float:right;
          background:skyblue;
          border:2px solid white}
</style>
<body>
<div class="welcome">
<%String name=(String)application.getAttribute("fullName"); %>
<h2 >welcome <%=name %></h2>
</div>
<a href="HomePage.html" style="float: right;text-decoration:none;text-shadow:orange;background:black;color:white">LogOut</a>

<marquee behavior="scroll" direction="left"><h2 style="color:skyblue;text-align: center;padding-top:5px;font-family:sans-serif;">
Everyday is a bank account, and time is our currency. No one is rich, no one is poor, we've got 24 hours each</h2></marquee>

<img alt="JSP* BAnK logo" src="viewlogo.png" width="200" height="100"> 
<div class="main">
<ul>
<li><a href="generateAccount.html">Create account</a></li>
<li><a href="ProfileInfor.jsp">My Profile</a></li>
<li><a href="UpdateProfilehtml.html">Update Profile</a></li>
</ul>
</div>
  <div class="dropdown">
  <button class="dropbtn">Services</button>
  <div class="dropdown-content">
    <a href="Loans.html">Loans</a>
    <a href="MoneyTransfer.html">Internet Banking</a>
    <a href="ATMcardServices.html">ATM Card Services</a>
    <a href="GenerateATMpin.html">Generate ATM pin</a>
    <a href="UpdateATMpin.html">Change ATM pin</a>
    <a href="">Block ATM card</a>
    
  </div>
</div>

<div class="offers">


<p style="color:blue" >On the occasion of 20 years of J S P* Bank Digital Banking, 
shop for your household needs from the comfort of your home and get discounts.</p>

<p style="color:blue">Get 20% off at BigBasket.com on a minimum purchase of ₹500.</p>

<h3 style="color:red">How to get your discount code:</h3>

<p style="color:blue">Login to J S P* Bank Internet Banking, iMobile Corporate Internet Banking or
 iBizz between 1th jan 19 to 14th Jan’19
Code will be sent to you via email</p>
<h3 style="color:red">Steps to avail the offer:</h3>

<p style="color:blue">Visit <a href="" style="text-decoration:none">BigBasket.com</a><br>
1.Select the products of your choice<br>
2.Use the code sent to your mail<br>
3.Make the payment using J S P* Bank <a href="InternetBanking.html" style="text-decoration:none">Internet banking</a><br>
4.The maximum discount that can be availed is ₹200. Offer valid till January 31, 2019.<br><br></p>

<h4 style="color:orange">Offer valid on first order on BigBasket.</h4>

</div>
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