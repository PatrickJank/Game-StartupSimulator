package BaseGame;

import OtherClasses.*;
import People.Worker;
import Projects.Project;
import Projects.ProjectGenerator;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DailyOption extends ProjectGenerator {
    Scanner select = new Scanner(System.in);
    Testing debug = new Testing();
    ProjectGenerator projects = new ProjectGenerator();
    Worker worker = new Worker();
    Dates dates = new Dates();
    int checking = dates.zusCheck();
    public int zusDealings = 0;
    Stats stats = new Stats();

    public void DailyChoice() {
        System.out.print("Today's date is ");
        Dates.startingDate();
        System.out.println(" SELECT AN ACTIVITY FOR TODAY...");
        System.out.println("");
        System.out.println("1 - SIGN A CONTRACT FOR A NEW PROJECT");
        System.out.println("2 - LOOK FOR A CLIENT - " + stats.daysWasted + " YOU AND YOUR WORKERS HAVE BEEN LOOKING FOR THIS MANY DAYS NOW");
        System.out.println("3 - SPEND THE DAY PROGRAMING STUFF");
        System.out.println("4 - SPEND THE DAY TESTING CODE");
        System.out.println("5 - GIVE THE CLIENT A FINISHED PRODUCT");
        System.out.println("6 - HIRE A NEW WORKER");
        System.out.println("7 - FIRE A WORKER");
        System.out.println("8 - SPEND THE DAY DEALING WITH AUTHORITIES/LEGAL STUFF");
        System.out.println("9 - CHECK STATS");
        System.out.println("10 - HIRE A SUBCONTRACTOR");
        System.out.println("11 - CLOSE THE GAME (PROGRESS IS NOT SAVED)");
        System.out.println("");
        SelectedOption();
    }

    public int anotherCheck = 0;

    public void SelectedOption() {
         {
            int option = select.nextInt();
            if (anotherCheck == 3) {
                System.out.println("CONGRATULATIONS! YOU HAVE WON!");
                System.exit(0);
            }
            worker.work();
            check();
            worker.ContractorWorking();
            checking = dates.zusCheck();
            switch (option) {
                case 1 -> {
                    if ((Project1.getProjectName() == null) || (Project2.getProjectName() == null)) {
                        DifficultyGenerator();
                    } else {
                        if (stats.daysWasted >= 5) {
                            projects.lookForAProject();
                            stats.daysWasted = 0;
                        } else {
                            System.out.println("Sorry, but you did not find anything!");
                        }

                    }
                    check();
                    Dates.increase(1);
                    DailyChoice();
                }
                case 2 -> {
                    System.out.println("You've spent the day looking for a client");
                    stats.daysWasted++;
                    check();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 3 -> {
                    check();
                    projects.workOnAProject();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 4 -> {
                    check();
                    debug.TestingOptions();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 5 -> {
                    System.out.println("YOU'VE DECIDED TO GIVE YOUR WORK TO THE CLIENT...");
                    if ((Project1.getProjectStatus()) && (!Project1.givenAlready)) {
                        stats.cash += 1000;
                        Project1.givenAlready = true;
                        anotherCheck++;
                    }
                    if ((Project2.getProjectStatus()) && (!Project2.givenAlready)) {
                        stats.cash += 1000;
                        Project2.givenAlready = true;
                        anotherCheck++;
                    }
                    if ((Project3.getProjectStatus()) && (!Project3.givenAlready)) {
                        stats.cash += 1000;
                        Project3.givenAlready = true;
                        anotherCheck++;
                    }
                    if ((Project4.getProjectStatus()) && (!Project4.givenAlready)) {
                        stats.cash += 1000;
                        Project4.givenAlready = true;
                        anotherCheck++;
                    }
                    if ((Project1.getProjectStatus()) && (!Project1.givenAlready)) {
                        stats.cash += 1000;
                        Project5.givenAlready = true;
                        anotherCheck++;
                    } else {
                        System.out.println("THE CLIENT IS NOT SATISFIED! YOU ARE GIVEN A PENALTY!");
                        stats.cash -= 200;
                    }
                    check();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 6 -> {
                    check();
                    worker.HireAWorker();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 7 -> {
                    worker.FireAWorker();
                    check();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 8 -> {
                    System.out.println("YOU'VE SPENT THE DAY DEALING WITH ZUS");
                    check();
                    zusDealings++;
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 9 -> {
                    check();
                    ProjectInfo();
                    DailyChoice();
                    SelectedOption();
                }
                case 10 -> {
                    worker.HireAContractor();
                    check();
                    Dates.increase(1);
                    DailyChoice();
                    SelectedOption();
                }
                case 11 -> System.exit(0);
            }
        }
        }




    public void check() {
        if ((checking == 30) && (zusDealings < 2)) {
            System.out.println("GAME OVER! YOU DID NOT DEAL WITH ZUS 2 TIMES THIS MONTH!");
            System.exit(0);
        }
        if (checking == 1) {
            zusDealings = 0;
        }
    }

    // You may ask yourself Why, oh why, does this exist?
    // My answer is simple, yet elegant: I have no idea. When I remove it everything breaks, so it has to stay.
    // It's just like the coconut png in the TF2 files, it has to stay. Sorry.
    public void TheGame() {
    }
}
