/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalpatientms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Admin
 */
public class dbconnect {

  
    Connection conn = null;
    public static Connection connectDB(){
   String url = "jdbc:derby://localhost:1527/Hospital_Patient";
    String user = "ketan";
    String password = "ketanram";
    Connection conn = null;
    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver"); // Load the Derby driver
        conn = DriverManager.getConnection(url, user, password);
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return conn;
}
}
