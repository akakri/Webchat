package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Datab {
    private String USER = "root";
    private String PASSWORD = "Akaki21akaki";
    private String URL = "jdbc:mysql://localhost:3306/messenger";

    public Datab() {
    }

    public Connection connect() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
            return connection;
        } catch (SQLException var3) {
            throw new RuntimeException(var3);
        }
    }
}