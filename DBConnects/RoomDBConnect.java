/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356teamproject;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Tuan Pham
 */
public class RoomDBConnect {
     Connection roomConn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection roomConn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Tuan Pham\\Documents\\NetBeansProjects\\CS356TeamProject\\Rooms.sqlite");            
            //JOptionPane.showMessageDialog(null,"Connected to Room database");
            return roomConn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    } 
}
