package com.campionato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String USERNAME="edoardo";
    private static final String PASSWORD= "marchetti";
    private static final String CONN="jdbc:mysql://localhost/serie a";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONN, USERNAME,PASSWORD);
    }
}
