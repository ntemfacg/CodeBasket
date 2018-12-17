/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecs_LoginStudent;
import ecs_system.welcomeTemp;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author pheon
 */
public class SqlController {
    String commandline;
    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "ntemfacg";
    String uPass = "1234";
    int wrongInput = 4;
    
    public boolean loginEnter(String password, String username) {
        boolean status = false;
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            System.out.println("Connected to database...");
            //empty string 
            String tempuser = "";
            String temppass = "";

            try {
                //try for an error 
                conn = DriverManager.getConnection(connectionURL, uName, uPass);
                //if DB connects run the following code
                if (conn != null) {
                    if (username.equals("")) {
                        JOptionPane.showMessageDialog(null, "Username Required");
                    } else if (password.equals("")) {
                        JOptionPane.showMessageDialog(null, "Password Required");
                    } else {
                        String sql = "SELECT USERNAME, PASSWORD FROM LOGIN WHERE USERNAME = '" + username + "'";
                        Statement st = conn.createStatement();
                        ResultSet rs = null;
                        rs = st.executeQuery(sql);
                        while (rs.next()) {
                            tempuser = rs.getString("USERNAME");
                            temppass = rs.getString("PASSWORD");
                            System.out.println("Username correct.");
                            if (tempuser.equals(username)) {
                                //check how mnay times the user gets the password wrong
                                if (!temppass.equals(password)) {
                                    wrongInput = wrongInput - 1;
                                    JOptionPane.showMessageDialog(null, "Incorrect login password for user: " + username + "\n" + wrongInput + " Attempt(s) Left");
                                    System.out.println(wrongInput);
                                }
                                if (wrongInput == 1) {
                                    JOptionPane.showMessageDialog(null, "Final Attempt ", "Warning", JOptionPane.ERROR_MESSAGE);
                                } else if (wrongInput == 0) {
                                    //if user enters 3 wrong password locks them out of the system 
                                    JOptionPane.showMessageDialog(null, "To many incorrect logins\nClosing down system ", "Warning", JOptionPane.ERROR_MESSAGE);
                                    status = true;
                                } else if (temppass.equals(password)) {
                                    new welcomeTemp().setVisible(true);
                                    System.out.println("Password correct.");
                                    wrongInput = 4;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "The username" + tempuser + " does not exist!");
                            }
                        }
                    }
                }
                //any errors due to connecting to DB catch and display to the user 
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            //if error has been thrown catch it 
        } catch (SQLException ex) {
            //print out the error name 
            System.out.println(ex);
        }
        return status;
    }


}