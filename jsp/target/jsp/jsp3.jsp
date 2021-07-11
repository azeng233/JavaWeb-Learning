<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--@include会将页面合二为一--%>
    <%@include file="header.jsp"%>
    <h1>项目主体</h1>
    <%@include file="footer.jsp"%>

    <hr>
    <%--jsp标签
        jsp:include:拼接页面，
        本质还是三个页面--%>
    <jsp:include page="header.jsp" />
    <h1>项目主体</h1>
    <jsp:include page="footer.jsp" />

</body>
</html>
