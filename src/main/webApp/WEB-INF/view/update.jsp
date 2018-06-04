<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="f"  uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form method="post" action="/user">
     <input type="hidden" name="_method" value="PUT"/>
    <input type="hidden" name="userId" value="${user.userId}"/>
    <table>
        <tr>
            <td>用户姓名</td>
            <td><input type="text"  name="userName" value="${user.userName}"/></td>
        </tr>
        <tr>
            <td>请输入年龄</td>
            <td><input type="text"  name="userAge" value="${user.userAge}"/></td>
        </tr>
        <tr>
            <td>请输入生日</td>
            <td><input type="text"  name="userBir"  value='<f:formatDate value="${user.userBir}" pattern="yyyy-MM-dd"/>'/></td>
        </tr>
        <tr>
            <td rowspan="1"><input type="submit"/></td>
        </tr>
    </table>
</form>
</body>
</html>