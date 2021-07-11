<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%@include file="header.jsp"%>
    <h1>项目主体</h1>
    <%@include file="footer.jsp"%>

    <hr>
    <%--jsp标签--%>
    <jsp:include page="header.jsp" />
    <h1>项目主体</h1>
    <jsp:include page="footer.jsp" />

</body>
</html>
