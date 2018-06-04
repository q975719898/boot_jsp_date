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
    <title>首页</title>
    <script src="<%=path%>/jquery-1.11.3.min.js"></script>
</head>
<body>
<a href="/toAddPage">新增</a>
<form id="formId" method="post" >
    <input type="hidden" name="_method" value="DELETE"/>
</form>
<table border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userAge}</td>
            <td>
                <f:formatDate value="${user.userBir}" pattern="yyyy-MM-dd"/>
            </td>
            <td>
                <input type="button" value="删除" onclick="deleteById(${user.userId})"/>
                <input type="button" value="修改" onclick="toUpdatePage(${user.userId})"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
<script>
    function deleteById(id){
        $("#formId").prop("action","<%=path%>/user/"+id);
        $("#formId").submit();
    }
    function toUpdatePage(id) {
        location.href="/toUpdatePage/"+id;
    }
</script>
</html>