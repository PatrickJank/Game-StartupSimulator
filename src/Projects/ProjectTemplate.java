package Projects;

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
    public String[] ProjectDescription = {"HELLO! I was working on a project for my friend but something broke and i can't seem to fix it..." +
            " please do something! I will pay a nice sum of cash! Alternatively i can help you invest in my crypto coins :).",
            "Create me a mobile game!",
            "Digitize our business!",
            "Looking for help with a project!",
            "Help us develop our framework!",
            "Military contract - Can't say too much.",
            "",
            "",
            "",
            "",
            "",
            ""};
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


    public void projects(int a) {
        switch (a) {
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


            //   System.out.println(ProjectName[0]);
            //  System.out.println(ProjectDescription[0]);

        }


    }
}
