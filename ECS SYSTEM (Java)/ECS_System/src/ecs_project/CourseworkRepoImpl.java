package ecs_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CourseworkRepoImpl {

    //Database URL, username and password are initialized.
    String connectionURL = "jdbc:derby://localhost:1527/Coursework_db";
    String uName = "henry";
    String uPass = "123";

    //returns all the existing coursework objects.
    public ArrayList getAll() {
        ArrayList<String> courseworks = new ArrayList<>();
        String temp;
        //connectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);

            //checks if the database is successfully connected or not.
            if (conn != null) {

                //creates a statement that will be used to handle database commands.
                Statement st = conn.createStatement();

                //ResultSet stores whatever the result that is returned after an execution of a command.
                ResultSet rs = null;

                //stores SQL command that will be sent to the database.
                String sql = "SELECT * FROM COURSEWORK";

                //initialized SQL command gets sent via the executeQuery.
                rs = st.executeQuery(sql);

                //loops while rs.next is null.
                while (rs.next()) {
                    //temp stores data retrived from each columns of the database in String format.
                    temp = rs.getInt("MODULE_CODE") + "\t" + rs.getString("MODULE_TITLE") + "\t"
                            + rs.getString("MODULE_TUTOR") + "\t" + rs.getString("COURSE_NO") + "\t"
                            + rs.getString("COURSE_TITLE") + "\t" + rs.getDate("COURSE_ISSUE") + "\t"
                            + rs.getDate("COURSE_DUE") + "\t" + rs.getString("COURSE_TYPE") + "\t"
                            + rs.getDouble("COURSE_MARK") + "\t" + rs.getString("COURSE_CREATION") + "\n";
                    courseworks.add(temp);
                }
            }
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //Arraylist is returned.
        return courseworks;
    }

    //creates a new group coursework object.
    public void addGroupCoursework(Group g) {
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //SQL command is initialized.
            String sql = "INSERT INTO COURSEWORK VALUES (" + g.modulecode + ", '" + g.moduletitle + "', '" + g.moduletutor + "', " + g.coursenumber + ", '" + g.coursetitle + "', '" + g.courseissue + "', '" + g.courseissue + "', '" + g.coursetype + "', " + g.coursemark + ", '" + g.createinfo + "')";
            //statement for the database is prepared.
            Statement st = conn.createStatement();
            //executeUpdate handles the SQL command.
            st.executeUpdate(sql);
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //creates a new individual coursework object.
    public void addIndividualCoursework(Individual i) {
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //SQL command is initialized.
            String sql = "INSERT INTO COURSEWORK VALUES (" + i.modulecode + ", '" + i.moduletitle + "', '" + i.moduletutor + "', " + i.coursenumber + ", '" + i.coursetitle + "', '" + i.courseissue + "', '" + i.courseissue + "', '" + i.coursetype + "', " + i.coursemark + ", '" + i.createinfo + "')";
            //statement for the database is prepared.
            Statement st = conn.createStatement();
            //executeUpdate handles the SQL command.
            st.executeUpdate(sql);
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //updates an existing group coursework object.
    public void updateGroupCoursework(Group g) {
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //SQL command is initialized.
            String sql = "UPDATE COURSEWORK SET MODULE_TITLE = '" + g.moduletitle + "', MODULE_TUTOR = '" + g.moduletutor + "', COURSE_NO = " + g.coursenumber + ", COURSE_TITLE = '" + g.coursetitle + "', COURSE_ISSUE = '" + g.courseissue + "', COURSE_DUE = '" + g.coursedue + "', COURSE_TYPE = '" + g.coursetype + "', COURSE_MARK = " + g.coursemark + " WHERE MODULE_CODE = " + g.modulecode;
            //statement for the database is prepared.
            Statement st = conn.createStatement();
            //executeUpdate handles the SQL command.
            st.executeUpdate(sql);
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //updates an existing individual coursework object.
    public void updateIndividualCoursework(Individual i) {
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //SQL command is initialized.
            String sql = "UPDATE COURSEWORK SET MODULE_TITLE = '" + i.moduletitle + "', MODULE_TUTOR = '" + i.moduletutor + "', COURSE_NO = " + i.coursenumber + ", COURSE_TITLE = '" + i.coursetitle + "', COURSE_ISSUE = '" + i.courseissue + "', COURSE_DUE = '" + i.coursedue + "', COURSE_TYPE = '" + i.coursetype + "', COURSE_MARK = " + i.coursemark + " WHERE MODULE_CODE = " + i.modulecode;
            //statement for the database is prepared.
            Statement st = conn.createStatement();
            //executeUpdate handles the SQL command.
            st.executeUpdate(sql);
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //removes an existing coursework object.
    public void removeCoursework(int modulecode) {
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //SQL command is initialized.
            String sql = "DELETE FROM COURSEWORK WHERE MODULE_CODE = " + modulecode;
            //statement for the database is prepared.
            Statement st = conn.createStatement();
            //executeUpdate handles the SQL command.
            st.executeUpdate(sql);
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    //generates a coversheet of a coursework object.
    public String generateCoursework(String coursetitle) {
        //String variable that will store a coversheet of a coursework object is initialized.
        String coversheet = "";
        try {
            //attempts to connect to the database.
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks the database is connected or not.
            if (conn != null) {
                //statement for database is prepared.
                Statement st = conn.createStatement();
                //ResultSet stores results from the database.
                ResultSet rs = null;
                //SQL command is initialized.
                String sql = "SELECT * FROM COURSEWORK WHERE COURSE_TITLE = '" + coursetitle + "'";
                //executeQuery handles the SQL command.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //coursework object attributes are returned as a string and are stored in the coversheet String variable.
                    coversheet = ("Coversheet has been generated..." + "\n\n" + "Module code: " + rs.getInt("MODULE_CODE") + "\n" + "Module title: " + rs.getString("MODULE_TITLE") + "\n"
                            + "Module tutor: " + rs.getString("MODULE_TUTOR") + "\n" + "Course number: " + rs.getString("COURSE_NO") + "\n" + "Course title: " + rs.getString("COURSE_TITLE") + "\n" + "Course issue: " + rs.getDate("COURSE_ISSUE")
                            + "\n" + "Course due: " + rs.getDate("COURSE_DUE") + "\n" + "Course type: " + rs.getString("COURSE_TYPE") + "\n" + "Course mark: " + rs.getDouble("COURSE_MARK") + "\n") + "Course created: " + rs.getString("COURSE_CREATION");
                }
            }
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //returns a coversheet String variable.
        return coversheet;
    }

    //returns all the existing coursework titles as an arraylist.
    public ArrayList getCourseworkTitles() {
        ArrayList<String> coursetitles = new ArrayList<>();
        String temp;
        //ConnectionURL, username and password should be specified in getConnection()       
        try {
            Connection conn = DriverManager.getConnection(connectionURL, uName, uPass);
            //checks if the database is connected.
            if (conn != null) {
                //statement for the database is prepared.
                Statement st = conn.createStatement();
                //resultset receives and sotres the result after the execution of SQL command.
                ResultSet rs = null;
                //SQL command is prepared.
                String sql = "SELECT COURSE_TITLE FROM COURSEWORK";
                //executeQuery handles the SQL command.
                rs = st.executeQuery(sql);
                //loops while rs.next is null.
                while (rs.next()) {
                    //temp String variable stores coursework title only.
                    temp = rs.getString("COURSE_TITLE");
                    //each temp variable is added into the coursetitles list.
                    coursetitles.add(temp);
                }
            }
            //catches an error in case the database fails to connect.
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        //the arraylist is returned.
        return coursetitles;
    }
}
