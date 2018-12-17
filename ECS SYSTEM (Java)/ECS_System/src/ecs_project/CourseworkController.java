package ecs_project;

import java.util.ArrayList;
import Utilities.FileUtils;

public class CourseworkController {

    //CourseworkRepoImpl class object is initialized.
    CourseworkRepoImpl c = new CourseworkRepoImpl();

    //returns a coursework list.
    public ArrayList getCourseworkList() {
        return c.getAll();
    }

    //submits an inidividual coursework object.
    public void submitIndividualCoursework(Individual i) {
        c.addIndividualCoursework(i);
    }

    //submits a group coursework object.
    public void submitGroupCoursework(Group g) {
        c.addGroupCoursework(g);
    }

    //updates an inidividual coursework object.
    public void updateIndividualCoursework(Individual i) {
        c.updateIndividualCoursework(i);
    }
    
    //updates a group coursework object.
    public void updateGroupCoursework(Group g) {
        c.updateGroupCoursework(g);
    }

    //deletes a coursework object.
    public void deleteCoursework(int modulecode) {
        c.removeCoursework(modulecode);
    }

    //generates a coursework detail.
    public String generateCourseworkDetails(String coursetitle) {
        return c.generateCoursework(coursetitle);
    }
    
    //returns all the existing coursework titles.
    public ArrayList getCourseworkTitles() {
        return c.getCourseworkTitles();
    }
    
    //downloads and saves a file that contains a coursework object coversheet in .doc format.
    public void downloadCoversheet(String TextArea) {
        ArrayList<String> res = new ArrayList();
        res.add(TextArea);
        FileUtils.writeListToFile(res, "coversheet.doc");
    }
}
