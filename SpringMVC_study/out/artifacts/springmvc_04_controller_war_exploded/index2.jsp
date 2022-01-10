<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2021/12/19
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post">
    <input type="text" name="username"/>
    <input type="submit" value="ok"/>
</form>
</body>
</html>
