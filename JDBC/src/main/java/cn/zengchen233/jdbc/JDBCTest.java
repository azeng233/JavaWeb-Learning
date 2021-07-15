package cn.zengchen233.jdbc;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://mysql.zengchen233.cn:3306/servlet学习?useUnicode=true&characterEncoding=utf-8";
        String username = "zengchen";
        String password = "Zengchen233";

        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2.连接数据库,代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        //3.向数据库发送SQL的对象Statement : CRUD
        Statement statement = connection.createStatement();

        //4.编写SQL
        String sql = "select * from users";

        //5.执行查询SQL，返回一个 ResultSet : 结果集
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            System.out.println("id = " + rs.getObject("id"));
            System.out.println("name = " + rs.getObject("name"));
            System.out.println("password = " + rs.getObject("password"));
            System.out.println("email = " + rs.getObject("email"));
            System.out.println("birthday = " + rs.getObject("birthday"));
        }

        //6.关闭连接，释放资源，先开后关
        rs.close();
        statement.close();
        connection.close();
    }
}
