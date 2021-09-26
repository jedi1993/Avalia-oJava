package br.com.abc.Projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexão {
    private static Connection connection;

    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection){
        try{

            if(connection != null)
                connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement stmt){
        close(connection);
        try{
            if(stmt != null)
                stmt.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }


}