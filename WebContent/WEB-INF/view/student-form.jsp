<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="GET" action="processForm" modelAttribute="student">
		FirstName :<form:input path="firstName"/>
		
		<br>
		<br>
		
		LastName :<form:input path="lastName"/>
		
		<br><br>
		Country :
		<form:select path="country">
			<form:option value="None">--Select--</form:option>
			<form:options items="${countryOptions}"  />
			
		</form:select>

		<br><br>
		Favourite Language :
		<form:radiobuttons path="favouriteLanguage" items="${favLanguages}"/>
		
		<br><br>
		<br><br>
		
		Operating Systems :
		Linux <form:checkbox path="operatingSystem" value="Linux"/>
		Mac-Os <form:checkbox path="operatingSystem" value="Mac-Os "/>
		Windows<form:checkbox path="operatingSystem" value="Windows"/>
		<br><br>
		
		<input type="submit"  value="submit"/>
	</form:form>
</body>
</html>