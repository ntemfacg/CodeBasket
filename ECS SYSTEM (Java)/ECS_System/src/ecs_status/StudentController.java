package ecs_status;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StudentController {
//This is what you need as a username and password to login
    String connectionURL = "jdbc:derby://localhost:1527/CourseworkStatus";
    String uName = "yusufm6";
    String uPass = "123";
// This is the code to update student name which will be stored in a SQL database
    public void updateStudentName(int id, String firstname, String lastname) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            String sql = "UPDATE SUBMISSION SET FIRSTNAME = '" + firstname + "', SURNAME = '" + lastname + "'" + " WHERE STUDENTID = " + id;
            Statement st = conn.createStatement();
            ResultSet rs = null;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Update Successful.", "Updated", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
   // This is the code to update the coursewrok status which will be stored in a SQL database 
    public void updateCourseworkStatus(int id, String status) {
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            String sql = "UPDATE SUBMISSION SET COURSEWORKSTATUS = '" + status + "' WHERE STUDENTID = " + id;
            Statement st = conn.createStatement();
            ResultSet rs = null;
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Update Successful.", "Updated", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
