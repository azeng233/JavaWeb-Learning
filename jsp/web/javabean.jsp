<%@ page import="cn.zengchen233.pojo.People" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    // People people = new People();

%>

<jsp:useBean id="people" class="cn.zengchen233.pojo.People" scope="page"/>
<jsp:setProperty name="people" property="id" value="1"/>
<jsp:setProperty name="people" property="name" value="曾晨"/>
<jsp:setProperty name="people" property="age" value="19"/>
<jsp:setProperty name="people" property="address" value="湖北省"/>

</body>
</html>
