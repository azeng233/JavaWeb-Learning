<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--内置对象--%>

<%
    pageContext.setAttribute("name1","曾晨1号");
    request.setAttribute("name2","曾晨2号");
    session.setAttribute("name3","曾晨3号");
    application.setAttribute("name4","曾晨4号");
%>

<%--脚本片段里面的代码会被原封不动的生成java文件--%>
<%
    // 通过pageContext取出我们保存的值,我们通过寻找方式来
    String name1 = (String) pageContext.findAttribute("name1");
    String name2 = (String) pageContext.findAttribute("name2");
    String name3 = (String) pageContext.findAttribute("name3");
    String name4 = (String) pageContext.findAttribute("name4");
    String name5 = (String) pageContext.findAttribute("name5");//不存在
%>
<%--使用EL表达式输出最快--%>
<h1>取出的值为:</h1>
<h3>${name1}</h3>
<h3>${name2}</h3>
<h3>${name3}</h3>
<h3>${name4}</h3>
<h3><%=name5%></h3>  <%--会输出null--%>
</body>
</html>
