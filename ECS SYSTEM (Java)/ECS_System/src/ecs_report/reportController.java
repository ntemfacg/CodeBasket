package ecs_report;

import Utilities.FileUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class reportController {

    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "henry";
    String uPass = "123";

    public ArrayList getStudentIDs() {
        ArrayList<String> studentIDs = new ArrayList<>();
        String temp;

        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT STUDENT_ID FROM SUBMISSION";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getString("STUDENT_ID");
                    studentIDs.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return studentIDs;
    }

    public ArrayList getCourseTitles() {
        ArrayList<String> coursetitles = new ArrayList<>();
        String temp;

        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;

                String sql = "SELECT COURSE_TITLE FROM COURSEWORK";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    temp = rs.getString("COURSE_TITLE");
                    coursetitles.add(temp);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return coursetitles;
    }

    public String generateReport(String ID, String title) {
        String report = "";
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            if (conn != null) {
                Statement st = conn.createStatement();
                ResultSet rs = null;
                String sql = "SELECT * FROM SUBMISSION WHERE STUDENT_ID = " + ID;
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    report += "Student ID: " + rs.getInt("STUDENT_ID") + "\n" + "First name: " + rs.getString("FIRST_NAME") + "\n"
                            + "Last name: " + rs.getString("LAST_NAME") + "\n" + "Coversheet:\n" + rs.getString("COVERSHEET") + "\n";
                }

                sql = "SELECT * FROM COURSEWORK WHERE COURSE_TITLE = '" + title + "'";
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    report += "Module code: " + rs.getInt("MODULE_CODE") + "\n" + "Module title: " + rs.getString("MODULE_TITLE") + "\n"
                            + "Module tutor: " + rs.getString("MODULE_TUTOR") + "\n" + "Course number: " + rs.getString("COURSE_NO") + "\n"
                            + "Course title: " + rs.getString("COURSE_TITLE") + "\n" + "Course issue: " + rs.getDate("COURSE_ISSUE") + "\n"
                            + "Course due: " + rs.getDate("COURSE_DUE") + "\n" + "Course type: " + rs.getString("COURSE_TYPE") + "\n"
                            + "Course mark: " + rs.getDouble("COURSE_MARK") + "\n";
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return report;
    }

    public void downloadReport(String TextArea) {
        ArrayList<String> res = new ArrayList();
        res.add(TextArea);
        FileUtils.writeListToFile(res, "report.csv");
    }
}
