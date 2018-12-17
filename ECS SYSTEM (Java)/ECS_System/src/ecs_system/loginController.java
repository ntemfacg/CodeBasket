package ecs_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginController {

    
    //main bulk of code run from this class here. Data is passed through to the controller where it will update the GUI 
    //Controller acts as the main class for the program 
    String commandline;
    String connectionURL = "jdbc:derby://localhost:1527/COURSEWORK";
    String uName = "jey";
    String uPass = "123";
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

    public boolean newUserConfirm(String username, String id, String password, String checkpass) {
        //empty string 
        String tempuser = "";
        String temppass = "";
        boolean status = true;

        try {
            //try connecting to the database 
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            //if it connections run following code
            if (conn != null) {
                // run if both username and passsword field are empty 
                if (username.equals("") && password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username & password is required");
                    //run if password field is empty
                } else if (password.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password is required");
                    //run if username is empty 
                } else if (username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username is required");
                } else {
                    //if both password and password checker are = to the same run 
                    if (password.equals(checkpass)) {
                        try {
                            //try catching errors which occur
                            //insert new user into the database 
                            String sql = "INSERT INTO LOGIN VALUES (" + Integer.parseInt(id) + ",'" + username + "'" + "," + "'" + password + "'" + "," + "'" + "TUTOR" + "')";
                            Statement st = conn.createStatement();
                            ResultSet rs = null;
                            //execute sql command 
                            st.executeUpdate(sql);
                            JOptionPane.showMessageDialog(null, "New user has created");
                            status = false;

                            //create new instance of gui login (return back to homescreen)
                            new guiLogin().setVisible(true);
                        } catch (Exception ex) {
                            //catch any error and throw following exception 
                            JOptionPane.showMessageDialog(null, "Duplicate ID has been found");
                        }
                    } else {
                        //if both passwords do not match 
                        JOptionPane.showMessageDialog(null, "Passwords do not match!");
                    }

                }  //Statement st = conn.createStatement();
            }
        } catch (SQLException ex) {
            //catch errors and throw follwoing error message out 
            System.out.println(ex);
        }
        return status;
    }

    public void removeUser(String password, String username, String checkPass) {

        String tempUser = "";
        String tempPass = "";

        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass); //new instance connection 
            System.out.println("Connecting to database..."); //inform user trying to connect to the database
            //if a secure connection has been made 
            if (conn != null) {  // run this code 
                if (username.equals("")) { // if username field is empty return error
                    JOptionPane.showMessageDialog(null, "Enter a username you wish to delete");
                } else if (password.equals("")) { // is password field is empty return error 
                    JOptionPane.showMessageDialog(null, "Enter a password"); // 
                } else if (password.equals("") && username.equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter a username and password");
                } else if (password.equals(checkPass)) {
                    try {
                        //run following sql statement to retrieve data from database 
                        String sql = "SELECT USERNAME,PASSWORD FROM LOGIN WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password + "'";
                        Statement st = conn.createStatement();
                        ResultSet rs = null;
                        rs = st.executeQuery(sql);

                        while (rs.next()) {
                            tempUser = rs.getString("USERNAME");
                            tempPass = rs.getString("PASSWORD");
                        }
                        if (tempPass.equals(password) && tempUser.equals(username)) {
                            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?");
                            if (dialogResult == JOptionPane.YES_OPTION) {
                                String sql1 = "DELETE FROM LOGIN WHERE USERNAME = '" + tempUser + "'";
                                st.executeUpdate(sql1);
                                JOptionPane.showMessageDialog(null, "Username: " + username + " has been removed!");
                                //new removeUser().setVisible(false);
                                new guiLogin().setVisible(true);
                            }

                        }
                        //System.out.println("World");
                    } catch (Exception ex) {
                        System.out.println(ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords do not match");
                }
            }

        } catch (Exception ex) {

            //catch any error and throw this excpetion error message
            System.out.println(ex);
        }
    }

    public boolean okButtonClicked(String username, String currentpass, String newpass, String confirmpass) {
        boolean status = false;
        try {
            //connect to DB
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //store temp data as empty strings 
            String tempuser = "";
            String tempcurpass = "";
            //if no data is inputted by the user run the follwoing code
            if (username.equals("") || currentpass.equals("") || newpass.equals("") || confirmpass.equals("")) {
                System.out.println("All the textfields require input...");
            } else if (!newpass.equals(confirmpass)) {
                //display this message if password do not match 
                JOptionPane.showMessageDialog(null, "Passwords do not match...");
            } else {
                try {
                    //check to see if password is saved within the DB
                    String sql = "SELECT PASSWORD FROM LOGIN WHERE USERNAME = '" + username + "'";
                    Statement st = conn.createStatement();
                    ResultSet rs = null;
                    rs = st.executeQuery(sql);
                    while (rs.next()) {
                        tempcurpass = rs.getString("PASSWORD");
                    }
                    if (tempcurpass.equals(currentpass)) {
                        //update the current password 
                        String sql1 = "UPDATE LOGIN SET PASSWORD = '" + newpass + "' WHERE USERNAME = '" + username + "'";
                        st.executeUpdate(sql1);
                        JOptionPane.showMessageDialog(null, "Password for " + username + " successfully changed.");
                        status = true;
                    } else {
                        //display if passwords do not match 
                        JOptionPane.showMessageDialog(null, "Passwords do not match...");
                    }
                } catch (SQLException ex) {
                    //catch errors and display the error code 
                    System.out.println(ex);
                    //display if username cant be found within the database 
                    JOptionPane.showMessageDialog(null, "Username doesn't exist...");
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return status;
    }
}
