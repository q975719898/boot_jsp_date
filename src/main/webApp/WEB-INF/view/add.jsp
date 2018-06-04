<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>新增页面</title>
</head>
<body>
<form method="post" action="/user">
    <table>
        <tr>
            <td>用户姓名</td>
            <td><input type="text"  name="userName"/></td>
        </tr>
        <tr>
            <td>请输入年龄</td>
            <td><input type="text"  name="userAge"/></td>
        </tr>
        <tr>
            <td>请输入生日</td>
            <td><input type="text"  name="userBir" /></td>
        </tr>
        <tr>
            <td rowspan="1"><input type="submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>