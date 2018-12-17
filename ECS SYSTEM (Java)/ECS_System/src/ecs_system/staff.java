/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_system;

/**
 *
 * @author dayj13
 */
public class staff {
    
    //global variables 
    String staffUsername;
    String staffPassword;
    int ID;
    
    //return staff username 
    public String getStaffUsername(){
        return staffUsername;
    }
    
    //set a staff username
    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }
    
    //get a staff password 
    public String getStaffPassword(){
        return staffPassword; 
    }
    
    //set a staff password
    public void setStaffPassword(String staffPassword){
        this.staffPassword = staffPassword;
    }
    
    //get a staff ID
    public int getID(){
        return ID;
        
    }
    //set a staff ID
    public void setStaffID(int ID){
        this.ID = ID;
    }
   
    
}