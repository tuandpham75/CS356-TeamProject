/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs356teamproject;

/**
 *
 * @author Tuan Pham
 */
public class Room {
    int roomNumber;
    String Available;

    
    
    public Room() {}
    
    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public int getRoomNumber() {
        return roomNumber;
    }
    
    public boolean isAvailable(int roomNumber) {
        // TODO : check room out of bounds
        boolean isAvailable;
        if (Available == "Available") {
            isAvailable = true;
        } else {
            isAvailable = false;
        }
        return isAvailable;
    }
}
