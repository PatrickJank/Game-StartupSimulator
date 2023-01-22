package Projects;

public class Project {

    public String ProjectName ;
        public String ProjectDescription;
        public boolean FrontEnd;
        public boolean Backend;
        public boolean mobile;
        public boolean dataBase;
        public boolean wordpress;
        public boolean prestashop;
        public String client;
        public String Deadline;
        public int Penalty;
        public int PaycheckDate;

    public Project(String ProjectName, String ProjectDescription, boolean FrontEnd, boolean Backend, boolean mobile, boolean dataBase, boolean wordpress, boolean prestashop, String client, String Deadline, int Penalty, int PaycheckDate) {
this.ProjectName = ProjectName;
this.ProjectDescription = ProjectDescription;
this.FrontEnd = FrontEnd;
this.Backend = Backend;
this.mobile = mobile;
this.dataBase = dataBase;
this.wordpress = wordpress;
this.prestashop = prestashop;
this.Penalty = Penalty;
this.PaycheckDate = PaycheckDate;
    }

public String test(){/*
    if(FrontEnd == true){
        System.out.println("FrontEnd knowledge is a must.");
    }
    if(Backend == true){
        System.out.println("Backend knowledge is a must.");
    }
    if(mobile == true){
        System.out.println("mobile knowledge is a must.");
    }
    if(dataBase == true){
        System.out.println("dataBase knowledge is a must.");
    }
    if(wordpress == true){
        System.out.println("wordpress knowledge is a must.");
    }
    if(prestashop == true){
        System.out.println("Prestashop knowledge is a must.");
    }
    */
       return(ProjectName+ " " + ProjectDescription + " " + Deadline + " " + Penalty + " " + PaycheckDate);
}

}
