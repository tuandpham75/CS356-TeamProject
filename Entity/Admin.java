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
public class Admin {
    private int adminID;
    private String username, password;
    public static void main(String[] args){
        addEmployee();
    }
    public Admin(int id, String user, String pass){
        this.adminID = id;
        this.username = user;
        this.password = pass;
    }
    
    public int getId(){
        return adminID;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    
    public static void addEmployee(){
        
    }
}
