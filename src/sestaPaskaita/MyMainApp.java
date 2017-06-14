package sestaPaskaita;

import utils.JdbcUtils;

import java.sql.*;

/**
 * Created by andriusbaltrunas on 6/13/2017.
 */
public class MyMainApp {

    public static void main(String[] args) {



        Connection connection = JdbcUtils.getConnection();
        if(JdbcUtils.isTableExist(connection, "students")){
            System.out.println("Students lentele yra sukurta!!!!");
        }
        /*try {
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/kcs", "root", "MySQL");
        } catch (SQLException e) {
            System.out.println("PRISIJUNGTI NEPAVYKTI !!!! "+ e);
        }*/

        ResultSet resultSet = JdbcUtils.getResultSet(connection, "SELECT * FROM students");
        if(resultSet != null){
            try {
                while(resultSet.next()){
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=").append(resultSet.getInt("id")).append(", name=")
                            .append(resultSet.getString("name")).append(", surname=")
                            .append(resultSet.getString(3)).append(", phone=")
                            .append(resultSet.getString("phone")).append(", email=")
                            .append(resultSet.getString("email"));
                    System.out.println(sb.toString());
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        /*if (connection != null){
            try {
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery("SELECT * FROM students");
                while(resultSet.next()){
                    StringBuilder sb = new StringBuilder();
                    sb.append("id=").append(resultSet.getInt("id")).append(", name=")
                    .append(resultSet.getString("name")).append(", surname=")
                            .append(resultSet.getString(3)).append(", phone=")
                            .append(resultSet.getString("phone")).append(", email=")
                            .append(resultSet.getString("email"));
                    System.out.println(sb.toString());
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/
    }
}
