<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<%--定制错误界面--%>

<%@ page errorPage="error/500.jsp" %>
<head>
    <title>Title</title>
</head>
<body>
<%
    int x = 1 / 0;
%>
</body>
</html>
