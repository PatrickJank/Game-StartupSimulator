package BaseGame;

import OtherClasses.*;
import Projects.ProjectGenerator;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DailyOption {
    int x = 5;
    Scanner select = new Scanner(System.in);
    Testing debug = new Testing();
    ProjectGenerator projects = new ProjectGenerator();
    Dates dates = new Dates();

    public void DailyChoice() {
        System.out.print("Today's date is ");
        Dates.startingDate();
        System.out.println(" SELECT AN ACTIVITY FOR TODAY...");
        System.out.println("");
        System.out.println("1 - SIGN A CONTRACT FOR A NEW PROJECT");
        System.out.println("2 - LOOK FOR A CLIENT - " + x + "DAYS LEFT");
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

    public void SelectedOption() {
        try {
        int option = select.nextInt();
        switch (option) {
            case 1 -> {
                projects.DifficultyGenerator();
                Dates.increase(1);
                DailyChoice();
            }
            case 2 -> {
                System.out.println("This is a placeholder for looking for a client");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 3 -> {

                projects.workOnAProject();

                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 4 -> {
                debug.TestingOptions();
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 5 -> {
                System.out.println("This is a placeholder for giving the finished project");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 6 -> {
                System.out.println("This is a placeholder for hiring a worker");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 7 -> {
                System.out.println("This is a placeholder for firing a worker");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 8 -> {
                System.out.println("This is a placeholder for dealing with zus");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 9 -> {
                projects.ProjectInfo();
                DailyChoice();
                SelectedOption();
            }
            case 10 -> {
                System.out.println("This is a placeholder for hiring a contractor");
                Dates.increase(1);
                DailyChoice();
                SelectedOption();
            }
            case 11 -> {
                System.exit(0);
            }
        }
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Please use valid inputs");
            SelectedOption();
        }


    }


    // You may ask yourself Why, oh why, does this exist?
    // My answer is simple, yet elegant: I have no idea. When I remove it everything breaks, so it has to stay.
    // It's just like the coconut png in the TF2 files, it has to stay. Sorry.
    public void TheGame() {
    }
}
