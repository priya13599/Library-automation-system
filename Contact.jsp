<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="home.css">
<link rel="stylesheet" href="login.css">
<style>
body {
    font-family: "Lato", sans-serif;
}

.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: white;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 25px;
    color: #99004d;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #660029;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

#main {
    transition: margin-left .5s;
    padding: 16px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 15px;}
  .sidenav a {font-size: 18px;}
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


<form class="modal-content" action="ControllerContactUs" >
    <div class="container">
      <h1 style="color:#99004d;">ContactUs Form</h1>
    
      <hr>
      <label for="name" style="color:#99004d;"><b>Name</b></label>
      <input type="text" placeholder="Enter Name" name="name" required>
      <br>

      <label for="email" style="color:#99004d;"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required>
      <br>
      
      <labelfor="phone" style="color:#99004d;"><b>Phone Number</b></label>
      <input type="text" id="phone" name="phone"placeholder="Enter Phone no."required />
       <br>
      
      
        <label for="subject" style="color:#99004d;"><b>Message</b></label>
    <textarea id="subject" name="msg" placeholder="Enquiry Message..." style="height:200px; width:630px;" required></textarea>
        <br>
        <br>
      <div class="clearfix">
       <input type="submit" class="signupbtn" value="SUBMIT" name ="c1"/>
        
      </div>
    </div>
  </form>



</body>
</html>