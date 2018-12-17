package ecs_project;

public class Individual extends Coursework {

    //All the variables needed to create a coursework object are initialized.
    int coursenumber = 0;
    String coursetitle = "";
    String moduletutor = "";
    double coursemark = 0.0;
    String coursetype = "Individual";

    //Constructor receives attributes of a new coursework object to be created.
    Individual(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark, String createinfo) {
        super(moduletitle, modulecode, courseissue, coursedue, createinfo);
        this.coursenumber = courseno;
        this.coursetitle = coursetitle;
        this.moduletutor = moduletutor;
        this.coursemark = coursemark;
    }

    //Another constructor that receives new attributes of an existing coursework object for an update.
    Individual(int modulecode, String moduletitle, String moduletutor, int courseno, String coursetitle, String courseissue, String coursedue, double coursemark) {
        super(moduletitle, modulecode, courseissue, coursedue);
        this.coursenumber = courseno;
        this.coursetitle = coursetitle;
        this.moduletutor = moduletutor;
        this.coursemark = coursemark;
    }

    //returns a date of creation.
    @Override
    public String getCreateInfo() {
        return createinfo;
    }

    //returns a course mark.
    @Override
    public double getCourseMark() {
        return coursemark;
    }

    //sets a course mark.
    @Override
    public void setCourseMark(double coursemark) {
        this.coursemark = coursemark;
    }

    //returns a course number.
    @Override
    public int getCourseNumber() {
        return coursenumber;
    }

    //sets a course number.
    @Override
    public void setCourseNumber(int coursenumber) {
        this.coursenumber = coursenumber;
    }

    //returns a course title.
    @Override
    public String getCourseTitle() {
        return coursetitle;
    }

    //sets a course title.
    @Override
    public void setCourseTitle(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    //returns a module tutor.
    @Override
    public String getModuleTutor() {
        return moduletutor;
    }

    //sets a module tutor.
    @Override
    public void setModuleTutor(String moduletutor) {
        this.moduletutor = moduletutor;
    }

    //returns a course type.
    @Override
    public String getCourseType() {
        return coursetype;
    }

    //sets a course type.
    @Override
    public void setCourseType(String type) {
        this.coursetype = type;
    }

    //returns a string of all information.
    @Override
    public String toString() {
        System.out.println("\n" + modulecode + "," + moduletitle + "," + moduletutor + "," + coursenumber + "," + coursetitle + "," + courseissue + "," + coursedue + "," + coursetype + "," + coursemark + "\n");
        return null;
    }
}
