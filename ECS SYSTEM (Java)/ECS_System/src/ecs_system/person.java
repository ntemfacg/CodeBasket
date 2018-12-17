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
public abstract class person {
    
    String username;
    String password;
    String type;
    //display username
    public String getUsername(){
        return username;
    }
    //set a username
    public void setUsername(String username) {
        this.username = username;
    }
    //get a password
    public String getPassword(){
        return password; 
    }
    //set a password
    public void setPassword(String password){
        this.password = password;
    }
    //get the object type
    public String getType(){
        return type; 
    }
    //set the object type
    public void setType(String type){
        this.type = type;
    }
}