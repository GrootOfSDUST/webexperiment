<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/9/17 0017
  Time: 19:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html >
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
    <title>login</title>
    <script>
        function check()
        {
            var name = document.getElementById("name").value;
            if(name == null || name == "")
            {
                alert("用户姓名不允许为空！");
            }
        }
    </script>
</head>
<body>
    <h1 style="text-align: center">
        欢迎您，老先生!
    </h1>
</body>
</html>
