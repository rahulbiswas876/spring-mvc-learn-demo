<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
Thank you <span>${customer.firstName} &nbsp; ${customer.lastName}</span> ! 
<br><br>

Free Passes :<span>${customer.freePasses}</span> 
<br><br>

Postal Code : ${customer.postalCode}
<br><br>

Course Code : ${customer.courseCode}
<br><br>

</body>
</html>