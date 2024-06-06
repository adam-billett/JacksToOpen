package database;

import java.sql.*;

public class DB {
    public static Connection connect() throws SQLException {

        try {
            //get db credentials from dbConfig class
            var jdbcUrl = DatabaseConfig.getDbUrl();
            var user = DatabaseConfig.getDbUser();
            var password = DatabaseConfig.getDbPassword();

            //open a connection
            return DriverManager.getConnection(jdbcUrl, user, password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
