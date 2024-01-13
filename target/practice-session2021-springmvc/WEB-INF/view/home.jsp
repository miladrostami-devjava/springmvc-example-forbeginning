<%--
  Created by IntelliJ IDEA.
  User: Parse
  Date: 1/13/2024
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@page session="false"  %>

<html>
<head>
    <title>Home</title>

</head>
<body>
<p>The Time on the server is  ${serverTime}.</p>
<form action="user.jsp" method="post">
  <input type="text" name="userName"><br>
  <input type="submit" name="Login">

</form>

  </body>
</html>
