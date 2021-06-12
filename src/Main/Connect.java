/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *
 * @author ACER
 */
public class Connect {
    
    private static Connection MySQLConfig;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3306/dbase_pertanian";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig=DriverManager.getConnection(url,user,pass);
        }catch(SQLException e){
            System.out.println("Connection to DBase Failed"+e.getMessage());
        }
        return MySQLConfig;
    }
}
