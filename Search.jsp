<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="Bean.BookDetails" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Book's Details</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="home.css">
<link rel="stylesheet" href="login.css">
<script type="text/javascript" src="https://gc.kis.v2.scr.kaspersky-labs.com/F83F6E00-42FF-4741-B1BD-B18C2DE9CA81/main.js" charset="UTF-8"></script>
<style type="text/css">
.button
{
border:none;
color:white;
padding:15px 32px;
text-align:center;
text-decoration:none;
display:inline-block;
font-size:16px;
margin:4px 2px;
cursor:pointer;

}

</style>
</head>
<body style="background-color:#66ffc2;">
<div class="logo">
<img src="ABESEC_logo.png" alt="ABES EC" float="left" height="130" width="110">
<div class ="title">
<u><font style="margin-left:-150px ; margin-top:60px; position:absolute; color:#99004d; " size="7px"><b><u>LIBRARY AUTOMATION SYSTEM</u></b></font></u>

</div>

</div>

<div class="navbar">
  <a href="home.html">Home</a>
  <a href="Registration.html">Registration</a>
  <div class="dropdown">
    <button class="dropbtn">Login As 
      <i class="fa fa-caret-down"></i>
    </button>
    <div class="dropdown-content">
     <a href="LoginAdmin.html">Admin</a>
      <a href="LoginLibrarian.html">Librarian</a>
    
   </div>
  </div> 
  
<a href="Contact.jsp">ContactUs</a>
</div>


<div class="container">

  <h1 align="center" style="color:#660029"><b><u>Book's Details</u></b></h1>
    <table class="table table-striped" border="1" >
    <thead>
      <tr>
        <th>Book Name</th>
        <th>Book No</th>
        <th>Author Name</th>
        <th>Publisher Name</th>
        <th>Quantity</th>
        <th>Edition</th>
        <th>Price</th>
        
        </tr>
    </thead>
<%

BookDetails e1=(BookDetails)session.getAttribute("s1");
if(e1==null)
{
	out.println("sorry record not found ");
}
else
{
%>
	<tbody>
    <tr>
      <td><%=e1.getBookName() %></td>
      <td><%=e1.getBookNo()%></td>
      <td><%=e1.getAuthorName()%></td>
      <td><%=e1.getPublisherName()%></td>
      <td><%=e1.getQuantity() %></td>
      <td><%= e1.getEdition() %></td>
      <td><%=e1.getPrice() %></td>
      
     
    </tr>
  </tbody>
 <%

}

%>


</body>
</html>