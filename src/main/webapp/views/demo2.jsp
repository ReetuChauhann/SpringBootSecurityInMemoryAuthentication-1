<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome on demo2</h1>
<c:out value="${name}">
</c:out>
<hr>
<hr>
      <a href="demo1">call demo one</a>
      <hr><hr>
    <form action="logout" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
    <button>Logout</button>
    </form>
<hr><hr>
</body>
</html>