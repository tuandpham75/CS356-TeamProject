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

public class EmployeeDBConnect {
    Connection conn = null;
    Connection connAdmin = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Tuan Pham\\Documents\\NetBeansProjects\\CS356TeamProject\\Employees.sqlite");
            //JOptionPane.showMessageDialog(null,"Connected to Employee database");
            return conn;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    } 
}
