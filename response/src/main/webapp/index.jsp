<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hel1o World!</h2>

<%--这里超交的路径,需要寻找到项目的路径--%>
<%--${pageContext. request, contextPath}代表当前的项目--%>
<form action="${pageContext.request.contextPath}/login" method="GET">
    用户名: <input type="text" name="username"> <br>
    密码: <input type="password" name="password"> <br>
    <input type="submit">
</form>

</body>
</html>
