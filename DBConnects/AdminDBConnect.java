/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356teamproject;

/**
 *
 * @author Aileen
 */
import java.sql.*;
import javax.swing.*;
public class AdminDBConnect {
    Connection adminConn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection adminConn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Tuan Pham\\Documents\\NetBeansProjects\\CS356TeamProject\\Admin.sqlite");            
            //JOptionPane.showMessageDialog(null,"Connected to Admin database");
            return adminConn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    } 
}
