package Projects;

import OtherClasses.NumberGenerator;

public class ProjectGenerator extends Project {
    private final String[] ProjectName = {"Create a Website for our shop!",
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
    private final String[] ProjectDescription = {"HELLO! I was working on a project for my friend but something broke and i can't seem to fix it... please do something! I will pay a nice sum of cash! Alternatively i can help you invest in my crypto coins :).",
            "I am looking for a talented individual for a private project. I also need you to keep this only between us two. I will pay a fair amount of money. Do not keep me waiting.",
            "Good evening friend, i am looking for a talented person to move some of our documentation in paper, to an online server/website. I'll be honest - i have no idea about any of this so it's all up to you. I will pay if needed.",
            "Help required. Details attached. You will be rewarded upon completion.",
            "Hello there. I need someone who understands this whole IT mambo jumbo skedaddle skidoddle stuff. Here is what you need to know:",
            "Develop a framework for my project. I will recommend you to me friends, i am an influencer so you will be rewarded generously...",
            "A programmer is needed to create a simple project. Details attached. In case you have any more questions, send me a message on twitter.",
            "Hey, it's Josh. We've met last friday on a dnd night, remember? You said you're working IT so i though you will be interested. Details bellow",
            "Good day! I need some talented people for a SECRET PROJECT (i cannot disclose any details coz i would have to silence you...)",
            "",
            "Enter description so your clients will know what you need!",
            "Hiiii :). I need help ;). Pls :(. Details bellow! :o. In case of questions send me a dm on twitter! =). Also check out my deviant art page :3"};
    //Why does this exist? It's to check if there are any accepted projects.
    private int check = 0;
    //Why do it like this?
    // Well, the project did not state any LIMITS to current projects, so it's easier to pre-make 2 projects and change their parameters.
    // it's easy to set the limit slightly higher at any point so it also gives the end user more input if needed (for example difficulty levels), so it's all gucci.
    NumberGenerator randomizer = new NumberGenerator();
    Project Project1 = new Project();
    Project Project2 = new Project();
    Project Project3 = new Project();
    Project Project4 = new Project();
    Project Project5 = new Project();

    /*
  Current design:
   * give a week for EACH technology in the project. This means 5 working days (currently i don't count weekends but we will see)
   * How long the player will be required to spend on each technology?
     Let's say 2 WORKING days. This can be adjusted with difficulty levels.
   *
  Side note: i still need to figure out how to do dates.
*/


    // use this to actually generate a random project.
    // This uses 2 pre-made class objects,
    // then assign generated values to them
    public void DifficultyGenerator() {
        int testing1 = (randomizer.NumberGeneratorValue2(11));
        int testing2 = (randomizer.NumberGeneratorValue2(11));
        String name1 = ProjectName[testing1];
        String name2 = ProjectDescription[testing2];
        if (check == 2) {
            System.out.println("You can't take any more projects! 2 is the limit, sorry!");
        } else {
            int Generate1_3 = randomizer.NumberGeneratorValue2(2);
            switch (Generate1_3) {
                case 0 -> {
                    System.out.println("This is an easy project.");

                    if (check == 0) {

                        Project1.setProjectName(name1);
                        Project1.setWorkDaysRequired(2);
                        Project1.setDeadline(7);
                        Project1.setProjectDescription(name2);
                    } else if (check == 1) {
                        Project2.setProjectName(name1);
                        Project2.setProjectDescription(name2);
                        Project2.setWorkDaysRequired(2);
                        Project2.setDeadline(7);
                    }
                    // if you ever see this then you deserve a cookie coz i dunno how that happened
                    else {
                        System.out.println("COŚ JEST NIE TAK SZEFUNCIU");
                    }

                    int Tier1 = randomizer.NumberGeneratorValue2(5);
                    switch (Tier1) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                                System.out.println(Project1.getFrontEnd());
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    check++;
                }
                case 1 -> {
                    if (check == 0) {

                        Project1.setProjectName(name1);
                        Project1.setWorkDaysRequired(4);
                        Project1.setDeadline(14);
                        Project1.setProjectDescription(name2);
                    } else if (check == 1) {
                        Project2.setProjectName(name1);
                        Project2.setProjectDescription(name2);
                        Project2.setWorkDaysRequired(4);
                        Project2.setDeadline(14);
                    }
                    // again, free cookie
                    else {
                        System.out.println("COŚ JEST NIE TAK SZEFUNCIU");
                    }

                    System.out.println("This is a medium project.");
                    //this is to be EXTRA sure it's not the same...it can still happen but the margins is extremely low
                    int Tier2_1;
                    int Tier2_2;
                    do {
                        Tier2_1 = randomizer.NumberGeneratorValue2(5);
                        Tier2_2 = randomizer.NumberGeneratorValue2(5);
                    }
                    while (Tier2_1 == Tier2_2);
                    switch (Tier2_1) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    switch (Tier2_2) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    check++;
                }
                case 2 -> {
                    if (check == 0) {

                        Project1.setProjectName(name1);
                        Project1.setWorkDaysRequired(6);
                        Project1.setDeadline(21);
                        Project1.setProjectDescription(name2);
                    } else if (check == 1) {
                        Project2.setProjectName(name1);
                        Project2.setProjectDescription(name2);
                        Project2.setWorkDaysRequired(6);
                        Project2.setDeadline(21);
                    } else {
                        System.out.println("COŚ JEST ZJEBANE SZEFUNCIU");
                    }

                    System.out.println("This is a HARD project");

                    Project1.setProjectName(name1);
                    Project1.setProjectDescription(name2);
                    int Tier3_1;
                    int Tier3_2;
                    int Tier3_3;
                    do {
                        Tier3_1 = randomizer.NumberGeneratorValue2(5);
                        Tier3_2 = randomizer.NumberGeneratorValue2(5);
                        Tier3_3 = randomizer.NumberGeneratorValue2(5);
                    }
                    while ((Tier3_1 == Tier3_3) || (Tier3_2 == Tier3_3) || (Tier3_1 == Tier3_2));
                    switch (Tier3_1) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    switch (Tier3_2) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    switch (Tier3_3) {
                        case 0:
                            if (check == 0) {
                                Project1.setFrontEnd(true);
                            } else {
                                Project2.setFrontEnd(true);
                            }
                            break;
                        case 1:
                            if (check == 0) {
                                Project1.setBackend(true);
                            } else {
                                Project2.setBackend(true);
                            }
                            break;
                        case 2:
                            if (check == 0) {
                                Project1.setMobile(true);
                            } else {
                                Project2.setMobile(true);
                            }
                            break;
                        case 3:
                            if (check == 0) {
                                Project1.setDataBase(true);
                            } else {
                                Project2.setDataBase(true);
                            }
                            break;
                        case 4:
                            if (check == 0) {
                                Project1.setWordpress(true);
                            } else {
                                Project2.setWordpress(true);
                            }
                            break;
                        case 5:
                            if (check == 0) {
                                Project1.setPrestashop(true);
                            } else {
                                Project2.setPrestashop(true);
                            }
                            break;
                    }
                    check++;
                }
            }
        }
    }


    // if the description is empty, this is not a bug! one of the presets is empty :3
    public void ProjectInfo() {


        if ((Project2.getProjectName()) != null) {
            System.out.println("");
            System.out.println("Here is all information about your second project:");
            System.out.println("");
            System.out.println("Project name: " + Project2.getProjectName());
            System.out.println("Project description is: " + Project2.getProjectDescription());
            System.out.println("Here is how big the penalty is: " + Project2.getPenalty());
            System.out.println("Here is how long you'll have to wait for the cash: " + Project2.getPaycheckDate());
            System.out.println("This person is your client: " + Project2.getClient());
            System.out.println("Here is your deadline: " + Project2.getDeadline());
            System.out.println("And here is how long you'll have to work on this project: " + Project2.getWorkDaysRequired());
            // Oh Lord here it goes
            if ((Project2.getDataBase())) {
                System.out.println("data bases is a requirement.");
            }
            if ((Project2.getMobile())) {
                System.out.println("Mobile stuff is a requirement.");
            }
            if ((Project2.getFrontEnd())) {
                System.out.println("FrontEnd knowledge is a requirement");
            }
            if ((Project2.getBackend())) {
                System.out.println("Backend knowledge is a requirement");
            }
            if ((Project2.getPrestashop())) {
                System.out.println("Prestashop knowledge is a requirement");
            }
            if ((Project2.getWordpress())) {
                System.out.println("Prestashop knowledge is a requirement");
            }
            System.out.println("");
        }

        if ((Project1.getProjectName()) != null) {
            System.out.println("Here is all information about your first project:");
            System.out.println("");
            System.out.println("Project name: " + Project1.getProjectName());
            System.out.println("Project description is: " + Project1.getProjectDescription());
            System.out.println("Here is how big the penalty is: " + Project1.getPenalty());
            System.out.println("Here is how long you'll have to wait for the cash: " + Project1.getPaycheckDate());
            System.out.println("This person is your client: " + Project1.getClient());
            System.out.println("Here is your deadline: " + Project1.getDeadline());
            System.out.println("And here is how long you'll have to work on this project: " + Project1.getWorkDaysRequired());
            if ((Project1.getDataBase())) {
                System.out.println("data bases is a requirement.");
            }
            if ((Project1.getMobile())) {
                System.out.println("Mobile stuff is a requirement.");
            }
            if ((Project1.getFrontEnd())) {
                System.out.println("FrontEnd knowledge is a requirement");
            }
            if ((Project1.getBackend())) {
                System.out.println("Backend knowledge is a requirement");
            }
            if ((Project1.getPrestashop())) {
                System.out.println("Prestashop knowledge is a requirement");
            }
            if ((Project1.getWordpress())) {
                System.out.println("Prestashop knowledge is a requirement");
            }
            System.out.println("");
        }
    }
}
