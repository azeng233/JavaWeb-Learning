<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--定义一个变量score，他的值为85--%>
<c:set var="score" value="85"/>


<c:choose>
    <c:when test="${score >= 90}">
        你的成绩很优秀
    </c:when>
    <c:when test="${score >= 80}">
        你的成绩一般
    </c:when>
    <c:when test="${score >= 70}">
        你的成绩很良好
    </c:when>
    <c:when test="${score <= 60}">
        你的成绩很垃圾
    </c:when>
</c:choose>



</body>
</html>
