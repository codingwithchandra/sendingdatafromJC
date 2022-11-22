<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: gray;">
       <h1>Spring Form Tag</h1>
         
         <form:form action="sendData" method="POST" modelAttribute="employee" name="employee">
         
         Enter Name:<input type="text" name="empName">
         Enter Mobile:<input type="text" name="mobile">
         <button type="submit">Submit</button>
         
         </form:form>
</body>
</html>