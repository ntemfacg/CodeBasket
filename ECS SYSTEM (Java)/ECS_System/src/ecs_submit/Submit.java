package ecs_submit;

public class Submit {
    
    //All the variables needed to get coursework and submit a coursework object are initialized.
    String CourseTitle;
    String ModuleTitle;
    String AttemptNumber;
    String SubmissionStatus;
    String GradingStatus;
    String DueDate;
    String TimeRemaining;
    String LastModified;
    String Comments;
    String SubmissionType;
    String SubmissionTitle;
    String SubmissionFile;
    String SubmissionText;
    int ReferenceNumber;
    String AssignmentTitle;
    String SubmissionAuthor;
    String SubmittedDate;
    
    
     
    //Constructor receives attributes of a submit object to be created.
    public Submit(String CourseTitle, String ModuleTitle, String AttemptNumber, String SubmissionStatus,String DueDate,
           String TimeRemaining, String LastModified, String Comments,String SubmissionType, String SubmissionTitle,
           String SubmissionFile, String SubmissionText, int ReferenceNumber, String AssignmentTitle, String SubmissionAuthor,
           String SubmittedDate) {
        this.CourseTitle = CourseTitle;
        this.ModuleTitle = ModuleTitle;
        this.AttemptNumber = AttemptNumber;
        this.SubmissionStatus = SubmissionStatus; 
        this.DueDate = DueDate;
        this.TimeRemaining = TimeRemaining;
        this.LastModified = LastModified;
        this.Comments = Comments; 
        this.SubmissionType = SubmissionType; 
        this.SubmissionTitle = SubmissionTitle;
        this.SubmissionFile = SubmissionFile;
        this.SubmissionText = SubmissionText;
        this.ReferenceNumber = ReferenceNumber;
        this.AssignmentTitle = AssignmentTitle; 
        this.SubmissionAuthor = SubmissionAuthor;
        this.SubmittedDate = SubmittedDate;
    }
    
    //returns a course title.
    public String getCourseTitle() {
        return CourseTitle;
    }
    
    //sets a course title.
    public void setCourseTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }
    
    //returns a module title.    
    public String getModuleTitle() {
        return ModuleTitle;
    }
    
    //sets a module title.
    public void setModuleTitle(String ModuleTitle) {
        this.ModuleTitle = ModuleTitle;
    }
    
    //returns a attempt number.    
    public String getAttemptNumber() {
        return AttemptNumber;
    }
    
    //set attempt number.    
    public void setAttemptNumber(String AttemptNumber) {
        this.AttemptNumber = AttemptNumber;
    }
    
     //return a submission status.       
    public String getSubmissionStatus() {
        return SubmissionStatus;
    }
    
    //set submission status.    
    public void setSubmissionStatus(String SubmissionStatus) {
        this.SubmissionStatus = SubmissionStatus;
    }
    
    //returns a coursework due date.
     public String getDueDate() {
        return DueDate;
    }

     //sets a coursework due date.
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    //returns a time remaining.
    public String getTimeRemaining() {
        return TimeRemaining;
    }

    //set time remaining.
    public void setTimeRemaining(String TimeRemaining) {
        this.TimeRemaining = TimeRemaining;
    }

    //returns a last modified.
    public String getLastModified() {
        return LastModified;
    }

    //set last modified.
    public void setLastModified(String LastModified) {
        this.LastModified = LastModified;
    }

    //set the comments.
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    //returns a comments.
    public String getComments() {
        return Comments;
    }
    
    //returns a submission type.
    public String getSubmissionType() {
        return SubmissionType;
    }

    //set the submission type.
    public void setSubmissionType(String SubmissionType) {
        this.SubmissionType = SubmissionType;
    }

    //returns a submission title.
    public String getSubmissionTitle() {
        return SubmissionTitle;
    }

    //set the submission title.
    public void setSubmissionTitle(String SubmissionTitle) {
        this.SubmissionTitle = SubmissionTitle;
    }
    
    //returns a submission file.
    public String getSubmissionFile() {
        return SubmissionFile;
    }

    //set a submission file.
    public void setSubmissionFile(String SubmissionFile) {
        this.SubmissionFile = SubmissionFile;
    }

    //returns a submission text.
    public String getSubmissionText() {
        return SubmissionText;
    }

    //set a submission text.
    public void setSubmissionText(String SubmissionText) {
        this.SubmissionText = SubmissionText;
    }
    
    //returns a reference number.
    public int getReferenceNumber() {
        return ReferenceNumber;
    }

    //set a reference number.
    public void setReferenceNumber(int ReferenceNumber) {
        this.ReferenceNumber = ReferenceNumber;
    }

    //returns a assignment title.
    public String getAssignmentTitle() {
        return AssignmentTitle;
    }

    //set a assignment title.
    public void setAssignmentTitle(String AssignmentTitle) {
        this.AssignmentTitle = AssignmentTitle;
    }
    
    //returns a submission author.
    public String getSubmissionAuthor() {
        return SubmissionAuthor;
    }

    //set a submission author.
    public void setSubmissionAuthor(String SubmissionAuthor) {
        this.SubmissionAuthor = SubmissionAuthor;
    }

    //returns a submitted date.
    public String getSubmittedDate() {
        return SubmittedDate;
    }

    //set a submitted date.
    public void setSubmittedDate(String SubmittedDate) {
        this.SubmittedDate = SubmittedDate;
    }
}
