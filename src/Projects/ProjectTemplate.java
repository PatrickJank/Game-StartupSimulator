package Projects;
import OtherClasses.NumberGenerator;

public class ProjectTemplate {
    public String[] ProjectName = {"Create a Website for our shop!",
            "Create me a mobile game!",
            "Digitize our business!",
            "Looking for help with a project!",
            "Help us develop our framework!",
            "Military contract - Can't say too much.",
            "Help me with a school project...",
            "Looking for smart programmers!",
            "I broke something and need some help fixing it...",
            "TOO MANY BUGZ",
            "Outsourcing required",
            "I need a person smarter than me"};
    public String[] ProjectDescription = {"HELLO! I was working on a project for my friend but something broke and i can't seem to fix it... please do something! I will pay a nice sum of cash! Alternatively i can help you invest in my crypto coins :).",
            "I am looking for a talented individual for a private project. I also need you to keep this only between us to. I will pay a fair amount of money. Do not keep me waiting.",
            "Good evening friend, i am looking for a talented person to move some of our documentation in paper, to an online server/website. I'll be honest - i have no idea about any of this so it's all up to you. I will pay if needed.",
            "Help required. Details attached. You will be rewarded upon completion.",
            "Hello there. I need someone who understands this whole IT mambo jumbo skedaddle skidoddle stuff. Here is what you need to know:",
            "Develop a framework for my project. I will recommend you to me friends, i am an influencer so you will be rewarded generously...",
            "A programmer is needed to create a simple project. Details attached. In case you have any more questions, send me a message on twitter.",
            "Hey, it's Josh. We've met last friday on a dnd night, remember? You said you're working IT so i though you will be interested. Details bellow",
            "Good day! I need some talented people for a SECRET PROJECT (i cannot disclose any details coz i would have to silence you...)",
            "",
            "Enter description so your clients will know what you need!",
            "Hiiii :). I need help :). Pls :(. Details bellow! :o. In case of questions send me a dm on twitter! =). Also check out my deviant art page :)"};
    private boolean FrontEnd;
    private boolean Backend;
    private boolean mobile;
    private boolean wordpress;
    private boolean prestashop;
    private char client;
    private char Deadline;
    private int Penalty;
    private int PaycheckDate;
    private int DifficultyLevel;
    NumberGenerator test = new NumberGenerator();

    private void projects(int project_name, int project_description) {
        switch (project_name) {
            case 0:
                System.out.println(ProjectName[0]);
                break;
            case 1:
                System.out.println(ProjectName[1]);
                break;
            case 2:
                System.out.println(ProjectName[2]);
                break;
            case 3:
                System.out.println(ProjectName[3]);
                break;
            case 4:
                System.out.println(ProjectName[4]);
                break;
            case 5:
                System.out.println(ProjectName[5]);
                break;
            case 6:
                System.out.println(ProjectName[6]);
                break;
            case 7:
                System.out.println(ProjectName[7]);
                break;
            case 8:
                System.out.println(ProjectName[8]);
                break;
            case 9:
                System.out.println(ProjectName[9]);
                break;
            case 10:
                System.out.println(ProjectName[10]);
                break;
            case 11:
                System.out.println(ProjectName[11]);
                break;
        }
        switch (project_description) {
            case 0:
                System.out.println(ProjectDescription[0]);
                break;
            case 1:
                System.out.println(ProjectDescription[1]);
                break;
            case 2:
                System.out.println(ProjectDescription[2]);
                break;
            case 3:
                System.out.println(ProjectDescription[3]);
                break;
            case 4:
                System.out.println(ProjectDescription[4]);
                break;
            case 5:
                System.out.println(ProjectDescription[5]);
                break;
            case 6:
                System.out.println(ProjectDescription[6]);
                break;
            case 7:
                System.out.println(ProjectDescription[7]);
                break;
            case 8:
                System.out.println(ProjectDescription[8]);
                break;
            case 9:
                System.out.println(ProjectDescription[9]);
                break;
            case 10:
                System.out.println(ProjectDescription[10]);
                break;
            case 11:
                System.out.println(ProjectDescription[11]);
                break;
        }
    }
    private void DifficultyGenerator(){
    int a = test.NumberGeneratorValue(1,3);
    switch(a){
        case 1:
            int b;



            break;
        case 2:




            break;
        case 3:




            break;
    }
    }


    private void EasyProject(int project_name, int project_description){
       projects(project_name, project_description);
    }
    private void MediumProject(int project_name, int project_description){
       projects(project_name, project_description);
    }
    private void HardProject(int project_name, int project_description){
        projects(project_name, project_description);
    }


    }
