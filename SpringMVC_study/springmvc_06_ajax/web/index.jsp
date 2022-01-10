<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2021/12/23
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>标题</title>
      <script src="${pageContext.request.contextPath}/statics/jquery-3.6.0.js"></script>
      <script>
        function a(){
          $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{"name":$("#username").val()},
             success:function (da){//接收返回数据
              alert(da);
            }
          })
        }
      </script>

  </head>
  <body>
    用户名：<input type="text" id="username" onblur="a()" >
  </body>
</html>
