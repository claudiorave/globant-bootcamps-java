
// 1.Create a singleton example for a database connection.




package org.secondstack.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MockConnection {

    private static MockConnection instance = null;
    private Connection connection;
    private String url = "localhost/globantbootcamps-java/db";
    private String username = "root";
    private String password = "root";

    private DatabaseConnection() throws SQLException {
        try {
           this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static MockConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new MockConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new MockConnection();
        }

        return instance;
    }
}