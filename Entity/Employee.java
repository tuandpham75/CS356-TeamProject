/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356teamproject;
import java.util.*;
import org.json.JSONObject;

/**
 *
 * @author Aileen
 */
public class Employee implements java.io.Serializable{
    private int id; 
    private String username, password;
    private List<Date> schedule = new ArrayList<Date>();
    
    public Employee(int ID, String user, String pass){
        this.id = ID;
        this.username = user;
        this.password = pass;
        //JSONObject json = new JSONObject(stringreadfromsqlite);
        
    }
    
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String toString(){
        return "id = " + id + "; username = " + username + "; password = " + password;
    }
    
    public List<Date> getSchedule() {
        return schedule;
    }
    
    public void scheduleDate(Date d) {
        schedule.add(d);
        
        //// TO DO ////
        //add to database to save
    }
    
    public void removeDate(Date d) {
        for (int i = 0; i < schedule.size(); i++) {
            Date del = schedule.get(i);
            if (del.equals(d)) {
                schedule.remove(i);
                break;
            }
        }
        /// TO DO: update/save to database
    }
}
