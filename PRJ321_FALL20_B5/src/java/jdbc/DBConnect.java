/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.*;

/**
 *
 * @author tuan anh
 */
public class DBConnect {

    private static Connection con;

    public static Connection getConnection() {

        try {

            if (con == null) {

                //driver class load
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                //create a connection..
                String url = "jdbc:sqlserver://localhost:1433; databaseName=PRJ321_FALL20_B5; user = sa; password = anhdn123";
                con = DriverManager.getConnection(url);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

}
