<%--
  Created by IntelliJ IDEA.
  User: 刘澳
  Date: 2020/10/2 0002
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/main" method="get">
    <table>
        <tr>
            <td>
                用户名：
            </td>
            <td>
                <input type="text" name="username" id="username">
            </td>
        </tr>
        <tr>
            <td>
                密码：
            </td>
            <td>
                <input type="password" name="password" id="password">
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" name="submit" id="submit">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
