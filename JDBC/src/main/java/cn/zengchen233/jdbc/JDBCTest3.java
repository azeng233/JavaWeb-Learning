package cn.zengchen233.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest3 {
    @Test
    public void Test3() {
        String url = "jdbc:mysql://mysql.zengchen233.cn:3306/servlet学习?useUnicode=true&characterEncoding=utf-8";
        String username = "zengchen";
        String password = "Zengchen233";

        Connection connection = null;
        //1.加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


        //2.连接数据库,代表数据库
        connection = DriverManager.getConnection(url, username, password);

        //3.通知数据库开启事务 false是开启
        connection.setAutoCommit(false);

        String sql = "update account\n" +
                "set money = money - 100\n" +
                "where name = 'A'";

        connection.prepareStatement(sql).executeUpdate();

        //制造错误
        // int i = 1 / 0;


        String sql2 = "update account\n" +
                "set money = money + 100\n" +
                "where name = 'B'";
        connection.prepareStatement(sql2).executeUpdate();

        connection.commit();//以上两条sql都执行成功了就提交事务
        System.out.println("提交成功!");
        } catch (Exception e) {
            try {
                //如果出现异常，就通知数据库回滚事务
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
