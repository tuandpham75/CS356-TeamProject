/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356teamproject;

import java.util.Date;
import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author Tuan Pham
 */
public class Meeting {
    Date meetingTime;
    private Date meetingDate;
    String memberName;
    int employeeID;
    //int[] attendeeIDs;
    

    ///
    
    //
    public Meeting() {}
    
    public Meeting(int ownerID, Room room, Date meetingTime, Date meetingDate, int[] attendeeIDs) {
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;   
        
        
    }
    
    public boolean isOwner(int id){
        return (id == employeeID);
    }
}
