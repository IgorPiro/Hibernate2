package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    // реализуйте настройку соеденения с БД

    //JDBC
    private final String url = "jdbc:mysql://localhost:3306/myDB";

    private final static String username = "root";

    private final static String pass = "rootroot";

    private Connection connection;

    public Connection baseConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, pass);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
//    public static final String URL = "jdbc:mysql://localhost:3306/myDB";
//    public static final String Driver = "com.mysql.cj.jdbc.Driver";
//    public static final String USERNAME = "root";
//    public static final String PASSWORD = "rootroot";
