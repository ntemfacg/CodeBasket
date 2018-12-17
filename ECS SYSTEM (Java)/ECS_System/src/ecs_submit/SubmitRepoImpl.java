package ecs_submit;

import Utilities.FileUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeamathu
 */
public class SubmitRepoImpl {

    //Database URL, username and password are initialized.
    String connectionURL = "jdbc:derby://localhost:1527/COURSEWORK";
    String uName = "jey";
    String uPass = "123";

    //returns all the existing coursework titles.
    public ArrayList getCourseworkTitles() {
        ArrayList<String> coursetitles = new ArrayList<>();
        String temp;
        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = "SELECT COURSE_TITLE FROM COURSEWORK";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp = rs.getString("COURSE_TITLE");
                    coursetitles.add(temp);
                }
            }
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //Coursetitle is returned.
        return coursetitles;
    }

    //updates an existing coursework attempt object.
    public String updateAttempt(String coursetitle) {
        //String variable that will store a coursework attempt object is initialized.
        String temp = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT ATTEMPT_NUMBER FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp = rs.getString("ATTEMPT_NUMBER");
                    
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //Course attempt is returned.
        return temp;
    }
    
    //updates an existing coursework submit status object.
    public String updateSStatus(String coursetitle) {
        //String variable that will store a coursework submit status object is initialized.
        String temp1 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT SUB_STATUS, GRADE_STATUS, COURSE_DUE, TIME_REMAIN, COURSE_CREATION FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp1 = rs.getString("SUB_STATUS");
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //coursework submit status is returned.
        return temp1;
    }
    
    //updates an existing coursework grading status object.
    public String updateGStatus(String coursetitle) {
        //String variable that will store a coursework grading status object is initialized.
        String temp2 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT  GRADE_STATUS FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp2 = rs.getString("GRADE_STATUS");
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //coursework grading status is returned.
        return temp2;
    }
    
    //updates an existing coursework due date object.
    public String updateDue(String coursetitle) {
        //String variable that will store a coursework due date object is initialized.
        String temp3 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT  COURSE_DUE FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp3 = rs.getString("COURSE_DUE");
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //coursework due date is returned.
        return temp3;
    }
    
    //updates an existing coursework time remaining to deadline object.
    public String updateRemain(String coursetitle) {
        //String variable that will store a coursework time remaining object is initialized.
        String temp4 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT TIME_REMAIN FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp4 = rs.getString("TIME_REMAIN");
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //coursework time remaining is returned.
        return temp4;
    }
    
    //updates an existing coursework last modified object.
    public String updateCreate(String coursetitle) {
        //String variable that will store a coursework last modified object is initialized.
        String temp5 = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = " SELECT  COURSE_CREATION FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp5 = rs.getString("COURSE_CREATION");
                }
            }
        //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //coursework last modified is returned.
        return temp5;
    }
    
    //Choose coursework file to submit.
    public String ChooseFile() {
        String temp = "";
        String[] res = FileUtils.readIntoArray("submission.doc");
        for (int i = 0; i < res.length; i++) {
            temp += res[i] + "\n";
        }
        return temp;
    }

    //Submit coursework and to create a reference number
    public int submitCourseworkCoursework(String filetyp, String subtitle, String content, boolean status) {
        boolean submitted = true;
        int reference = 0;
        if (status) {
            try {
                //Date formate is initiallised 
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy_HH:mm:ss");
                // Get the local time
                LocalDateTime now = LocalDateTime.now();
                String submitinfo = dtf.format(now);
                //Create random object
                Random rnd = new Random();
                reference = 100000 + rnd.nextInt(900000);

                //connectionURL, username and password should be specified in getConnection()
                Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
                //stores SQL command that will be sent to the database.
                String sql = "INSERT INTO SUBMIT VALUES ('" + subtitle + "', '" + filetyp + "', '" + content + "', " + reference + ", '" + submitinfo + "')";
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //initialized SQL command gets sent via the executeQuery.
                st.executeUpdate(sql);
                Submited4 a = new Submited4(content, reference);
                SubmitFile3 b = new SubmitFile3();
                b.setVisible(false);
                a.setVisible(true);
                //catches an error in case the database fails to connect.
            } catch (SQLException ex) {
                System.out.println(ex);
                //catches an error in case the database fails to connect.
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Data format is not matching!", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Submited6 a = new Submited6();
            SubmitFile3 b = new SubmitFile3();
            a.setVisible(true);
            b.setVisible(false);
        }
        //Return reference number of the submited coursework
        return reference;
    }

    // To create digital receipt
    public String digitalReceipt(Submit dr) {
        //String variable that will store a digital receipt object is initialized.
        String dreceipt = "";
        
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is successfully connected or not.
            if (conn != null) {
                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();
                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;
                //stores SQL command that will be sent to the database.
                String sql = "SELECT * FROM SUMBIT";
                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    dreceipt = ("DigitalReceipt has been generated..." + "\n\n" + "REF_NUMBER" + rs.getInt("SUBMISSSION_TITLE") + "\n" + "SUB_DATE");
                }
            }
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //Digital recepit is returned.
        return dreceipt;
    }
}
