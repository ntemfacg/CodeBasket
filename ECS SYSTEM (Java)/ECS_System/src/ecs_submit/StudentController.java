package ecs_submit;

import java.util.ArrayList;
import Utilities.FileUtils;

public class StudentController {
    
    //SubmitRepoImpl class object is initialized.
    SubmitRepoImpl c = new SubmitRepoImpl();

    //returns a coursework list.
    public ArrayList getCourseworkList() {
        return c.getCourseworkTitles();
    }

    // To sumbit coursewirk
    public void submitCoursework(Submit cw) {
     //   c.submitCourseworkCoursework(cw);
    }
    
    // generate digital receipt
    public void digitalReceipt(Submit dr) {
        c.digitalReceipt(dr);
    }
    
    //downloads and saves a file that contains a coursework object in .doc format.
    public void downloadCoversheet(String TextArea) {
        ArrayList<String> res = new ArrayList();
        res.add(TextArea);
        FileUtils.writeListToFile(res, "Coursework.doc");
    }
}
