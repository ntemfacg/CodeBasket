package ecs_project;

public abstract class Coursework {

    //All the variables needed to create a coursework object are initialized.
    String moduletitle;
    int modulecode;
    String courseissue;
    String coursedue;
    String createinfo;

    //Constructor receives attributes of a new coursework object to be created.
    public Coursework(String moduletitle, int modulecode, String courseissue, String coursedue, String createinfo) {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
        this.courseissue = courseissue;
        this.coursedue = coursedue;
        this.createinfo = createinfo;
    }

    //Another constructor that receives new attributes of an existing coursework object for an update.
    public Coursework(String moduletitle, int modulecode, String courseissue, String coursedue) {
        this.modulecode = modulecode;
        this.moduletitle = moduletitle;
        this.courseissue = courseissue;
        this.coursedue = coursedue;
    }

    //returns a module title.
    public String getModuleTitle() {
        return moduletitle;
    }

    //sets a module title.
    public void setModuleTitle(String moduletitle) {
        this.moduletitle = moduletitle;
    }

    //returns a coursework issued date.
    public String getCourseIssue() {
        return courseissue;
    }

    //sets a coursework issued date.
    public void setCourseIssue(String issue) {
        this.courseissue = issue;
    }

    //returns a module code.
    public int getModuleCode() {
        return modulecode;
    }

    //sets a module code.
    public void setModuleCode(int modulecode) {
        this.modulecode = modulecode;
    }

    //returns a coursework due date.
    public String getCourseDue() {
        return coursedue;
    }
    
    //sets a coursework due date.
    public void setCourseDue(String coursedue) {
        this.coursedue = coursedue;
    }

    //returns a coursework creation date.
    public String getCreateInfo() {
        return null;
    }

    //returns a coursework mark.
    public double getCourseMark() {
        return 0;
    }

    //sets a coursework mark.
    public void setCourseMark(double coursemark) {
    }

    //returns a course number.
    public int getCourseNumber() {
        return 0;
    }

    //sets a course number.
    public void setCourseNumber(int coursenumber) {
    }

    //returns a course title.
    public String getCourseTitle() {
        return null;
    }

    //sets a course title.
    public void setCourseTitle(String coursetitle) {
    }

    //returns a module tutor.
    public String getModuleTutor() {
        return null;
    }

    //sets a module tutor.
    public void setModuleTutor(String moduletutor) {
    }

    //returns a course type.
    public String getCourseType() {
        return null;
    }

    //sets a course type.
    public void setCourseType(String coursetype) {
    }
}
