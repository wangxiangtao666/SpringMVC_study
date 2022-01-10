<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2022/1/9
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login">
    用户名：<input type="text" name="username"/>
    密码：<input type="password" name="password">
    <input type="submit">
</form>
</body>
</html>
