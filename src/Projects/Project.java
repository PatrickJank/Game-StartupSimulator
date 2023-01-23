package Projects;

import People.Client;

public class Project {
    
    
    
    private String ProjectName;
    private String ProjectDescription;
    private boolean FrontEnd;
    private boolean Backend;
    private boolean mobile;
    private boolean dataBase;
    private boolean wordpress;
    private boolean prestashop;
    // replace this with a client object, then remove this comment you dummy
    private String Client;
    private String Deadline;
    private int Penalty;
    private int PaycheckDate;

    public Project(String ProjectName, String ProjectDescription){

    }
// May Lord forgive me for this mess
public void setProjectName(String ProjectName)
{
        this.ProjectName=ProjectName;
}
public void setClient(String Client)
{
        this.Client=Client;
}

public void setDeadline(String Deadline)
    {
        this.Deadline=Deadline;
    }
public void setPenalty(int Penalty)
    {
        this.Penalty=Penalty;
    }
public void setPaycheckDate(int PaycheckDate)
    {
        this.PaycheckDate=PaycheckDate;
    }
public void setProjectDescription(String ProjectDescription)
    {
        this.ProjectDescription=ProjectDescription;
    }

public void setFrontEnd(boolean FrontEnd){
        this.FrontEnd=FrontEnd;
}
public void setBackend(boolean Backend){
        this.Backend=Backend;
}
public void setMobile(boolean Mobile){
        this.mobile=Mobile;
}
public void setDataBase(boolean DataBase){
        this.dataBase=DataBase;
}
public void setWordpress(boolean Wordpress){
        this.wordpress=wordpress;
}
public void setPrestashop(boolean prestashop){
        this.prestashop=prestashop;
}

public String getProjectName(){
        return ProjectName;
}
public String getProjectDescription(){
        return ProjectDescription;
}

public String getClient(){
        return Client;
}
public boolean getFrontEnd(){
        return FrontEnd;
}
public boolean getBackend(){
        return Backend;
    }
public boolean getMobile(){
        return mobile;
    }

public boolean getDataBase(){
        return dataBase;
    }
public boolean getWordpress() {
    return wordpress;
}

public boolean getPrestashop(){
        return prestashop;
}

public String getDeadline(){
        return Deadline;
}
public int getPenalty(){
        return Penalty;
}

public int getPaycheckDate(){
        return PaycheckDate;
}


}
