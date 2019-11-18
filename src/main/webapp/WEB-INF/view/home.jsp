<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Students</h1>
	<c:forEach var = "stu" items="${allstu}">
    	<c:out value = "name : ${stu.name}"/> &nbsp <c:out value = "ID : ${stu.studentId}"/> <p>
	</c:forEach>
</body>
</html>