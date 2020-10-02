<%--
  Created by IntelliJ IDEA.
  User: 刘澳
  Date: 2020/9/23 0023
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息打印</title>
</head>
<body>
    <%
        String name = (String) session.getAttribute("name");

        Cookie[] cookies = request.getCookies();
        for (Cookie c:cookies)
        {
            if ("age".equals(c.getName()))
            {
                String age = c.getValue();
            }
        }

        String school = (String) application.getAttribute("school");
    %>
    <h1>name</h1>
    <h1>age</h1>
    <h1>String</h1>
</body>
</html>
