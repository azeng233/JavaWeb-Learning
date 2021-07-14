<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>
    恭喜您，登陆成功!
</h3>
<br>
<h2>当前共有<span style="color: brown">
    <%=this.getServletConfig().getServletContext().getAttribute("OnlineCount")%></span>
    人在线</h2>
<br>
<p><a href="/servlet/logout">注销</a> </p>
</body>
</html>
