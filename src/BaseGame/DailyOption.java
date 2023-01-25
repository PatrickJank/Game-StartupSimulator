package BaseGame;
import OtherClasses.*;
import Projects.ProjectGenerator;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DailyOption extends Dates{
    Dates test = new Dates();
int x = 5;
Scanner select = new Scanner(System.in);
Testing debug = new Testing();
ProjectGenerator projects = new ProjectGenerator();

    public void DailyChoice(){
        System.out.println("SELECT AN ACTIVITY FOR TODAY...");
        System.out.println("");
        System.out.println("1 - SIGN A CONTRACT FOR A NEW PROJECT");
        System.out.println("2 - LOOK FOR A CLIENT - "+ x +"DAYS LEFT");
        System.out.println("3 - SPEND THE DAY PROGRAMING STUFF");
        System.out.println("4 - SPEND THE DAY TESTING CODE");
        System.out.println("5 - GIVE THE CLIENT A FINISHED PRODUCT");
        System.out.println("6 - HIRE A NEW WORKER");
        System.out.println("7 - FIRE A WORKER");
        System.out.println("8 - SPEND THE DAY DEALING WITH AUTHORITIES/LEGAL STUFF");
        System.out.println("9 - CHECK STATS");
        System.out.println("10 - HIRE A SUBCONTRACTOR");
        SelectedOption();
    }
    Dates dates = new Dates();


    public void SelectedOption(){
        int option = select.nextInt();
        switch (option) {
            case 1 -> {
                projects.DifficultyGenerator();
                SelectedOption();
            }
            case 2 ->{ System.out.println("This is a placeholder for looking for a client");SelectedOption();}
            case 3 -> {System.out.println("This is a placeholder for programing stuff");
                SelectedOption();}
            case 4 ->{ debug.TestingOptions();
                SelectedOption();}
            case 5 -> {System.out.println("This is a placeholder for giving the finished project");
                SelectedOption();}
            case 6 -> {System.out.println("This is a placeholder for hiring a worker");
                SelectedOption();}
            case 7 -> {System.out.println("This is a placeholder for firing a worker");
                SelectedOption();}
            case 8 -> {System.out.println("This is a placeholder for dealing with zus");
                SelectedOption();}
            case 9 -> {projects.ProjectInfo();SelectedOption();}
            case 10 -> {System.out.println("This is a placeholder for hiring a contractor");;SelectedOption();}
            case 11 -> {dates.enterDate();}
        }





    }




    public void TheGame() {
    }
}
