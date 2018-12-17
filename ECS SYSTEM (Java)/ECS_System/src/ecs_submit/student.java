/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_submit;

public class student {
    
    //global variables 
    String studentUsername;
    String studentPassword;
    int ID;
    
    //return student username 
    public String getStudentUsername(){
        return studentUsername;
    }
    
    //create a student username
    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }
    
    //return student passaword 
    public String getStudentPassword(){
        return studentPassword; 
    }
    
    //set student password 
    public void setStudentPassword(String studentPassword){
        this.studentPassword = studentPassword;
    }
    
    //get student ID
    public int getID(){
        return ID;
    }
    
    //set student ID
    public void setID(int ID){
        this.ID = ID;
    }
    
}