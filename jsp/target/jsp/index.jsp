<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <%--jsp表达式
    作用:用来将程序的输出输出 到客户端--%>
  <%= new java.util.Date()%>
  <hr>
  <%--jsp脚本片段--%>
  <%
    int sum = 0;
    for (int i = 0; i <= 100; i++) {
      sum += i;
    }
    out.println("<h1>Sum = "+ sum +"</h1>");
  %>
  <%
    int x = 10;
    out.print(x);
  %>
  <p>这是一个jsp文档</p>
  <%
    int y = 2;
    out.print(y);
  %>
  <%--在代码中嵌入html元素--%>
  <%
    for (int i = 0; i < 5; i++) {
  %>
  <h1>Hello,World!</h1>
  <%
    }
  %>
  <hr>

  <%!
    static {
      System.out.println("Loading Servlet!");
    }

    private int globalVar = 0;

    public void zCC() {
    System.out.println("进入方法zCC!");
  }
  %>


  </body>
</html>
