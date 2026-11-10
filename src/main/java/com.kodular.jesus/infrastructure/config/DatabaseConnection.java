package com.example.usuario.infrastructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:postgresql://db.hebtsvubvagqzvpohicc.supabase.co:5432/postgres";

    private static final String USER =
            "postgres";

    private static final String PASSWORD =
            "Ja30,69nd,";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}