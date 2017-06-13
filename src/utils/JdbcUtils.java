package utils;

import com.sun.istack.internal.Nullable;

import java.sql.*;

/**
 * Created by andriusbaltrunas on 6/13/2017.
 */
public class JdbcUtils {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/kcs";
    private static final String NAME = "root";
    private static final String PASSWORD = "MySQL";

    @Nullable
    public static Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, NAME, PASSWORD);
        } catch (SQLException e) {
            System.out.println("NEPRISIJUNGEM " + e);
        }
        return connection;
    }

    public static ResultSet getResultSet(Connection connection, String query){
        ResultSet resultSet = null;
        if(connection != null && query != null){
            try {
                Statement st = connection.createStatement();
                resultSet = st.executeQuery(query);
            } catch (SQLException e) {
                System.out.println("SUKURTI Statement NEPAVYKO");
            }
        }
        return resultSet;
    }
}
