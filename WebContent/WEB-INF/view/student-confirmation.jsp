<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br>Thank you for registration : ${student.firstName} &nbsp; ${student.lastName}
	<br>Country : ${student.country}<br>
	<br>Favourate Language : ${student.favouriteLanguage}<br>
	<br>
	Selected OS : 
	<ul>
		<c:forEach var="item" items="${student.operatingSystem}">
			<li> ${item}</li>
		</c:forEach>
	</ul>
	
	<br>
</body>
</html>