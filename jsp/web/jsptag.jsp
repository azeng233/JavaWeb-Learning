<%@ taglib prefix="jap" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>jsptag1</h1>
<jsp:forward page="/jsptag2.jsp">
    <jsp:param name="name" value="zengchen"/>
    <jsp:param name="age" value="19"/>
</jsp:forward>



</body>
</html>
