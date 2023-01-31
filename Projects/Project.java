package Projects;

import OtherClasses.NumberGenerator;

public class Project {

    NumberGenerator generator = new NumberGenerator();
    int bugCount = 0;
    private String ProjectName;
    private String ProjectDescription;
    private boolean FrontEnd = false;
    private boolean Backend = false;
    private boolean mobile = false;
    private boolean dataBase = false;
    private boolean wordpress = false;
    private boolean prestashop = false;

    private int workDaysRequired;
    // replace this with a client object, then remove this comment you dummy :3
    private String Client;
    private int Deadline;
    private int Penalty;
    private int PaycheckDate;
    private boolean projectStatus;


// May Lord forgive me for this mess

    public void setProjectStatus(boolean projectStatus){ this.projectStatus = projectStatus;}

    public void setWorkDaysRequired(int WorkDaysRequired) {
        this.workDaysRequired = WorkDaysRequired;
    }

    public int getWorkDaysRequired() {
        return workDaysRequired;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public void setClient(String Client) {
        this.Client = Client;
    }

    public void setDeadline(int Deadline) {
        this.Deadline = Deadline;
    }

    public void setPenalty(int Penalty) {
        this.Penalty = Penalty;
    }

    public void setPaycheckDate(int PaycheckDate) {
        this.PaycheckDate = PaycheckDate;
    }

    public void setProjectDescription(String ProjectDescription) {
        this.ProjectDescription = ProjectDescription;
    }

    public void setFrontEnd(boolean FrontEnd) {
        this.FrontEnd = FrontEnd;
    }

    public void setBackend(boolean Backend) {
        this.Backend = Backend;
    }

    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }

    public void setDataBase(boolean dataBase) {
        this.dataBase = dataBase;
    }

    public void setWordpress(boolean wordpress) {
        this.wordpress = wordpress;
    }

    public void setPrestashop(boolean prestashop) {
        this.prestashop = prestashop;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public String getProjectDescription() {
        return ProjectDescription;
    }

    public String getClient() {
        return Client;
    }

    public boolean getFrontEnd() {
        return FrontEnd;
    }

    public boolean getBackend() {
        return Backend;
    }

    public boolean getMobile() {
        return mobile;
    }

    public boolean getDataBase() {
        return dataBase;
    }

    public boolean getWordpress() {
        return wordpress;
    }

    public boolean getPrestashop() {
        return prestashop;
    }

    public int getDeadline() {
        return Deadline;
    }

    public int getPenalty() {
        return Penalty;
    }

    public int getPaycheckDate() {
        return PaycheckDate;
    }

    public boolean getProjectStatus() {
        return projectStatus;
    }

    public void workOnAProject() {
        int b = generator.NumberGeneratorValue2(10);
        this.workDaysRequired = workDaysRequired-1;
        if (getWorkDaysRequired() == 0) {
            System.out.println("Project has been completed!");
            setProjectStatus(true);
        }
        if(b <= 1 ){
            bugCount++;
        }

    }

}
