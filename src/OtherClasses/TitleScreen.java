package OtherClasses;

import settings.SettingsSelection;
import java.util.Scanner;
public class TitleScreen {
SettingsSelection GoToSettings = new SettingsSelection();
   private Scanner select = new Scanner(System.in);




    public void MainOptions(int option1) {
        if(option1 == 1)
        {
            System.out.println("Test nowa gra");
            System.out.println("");
        }
        else if (option1 == 2) {
            System.out.println("");
            GoToSettings.Selection();
            menuRepeat();
        }
        else if (option1 ==3) {
            System.out.println("Design by Patryk Jankiewicz");
            System.out.println("Programed by Patryk Jankiewicz");
            System.out.println("Tested by Patryk Jankiewicz");
            System.out.println("Praying for the code to work: Patryk Jankiewicz");
            System.out.println("");
            menuRepeat();
        }
        else
            System.out.println("Please enter a valid number");

    }


public void WelcomeScreen(){
        System.out.println("WELCOME TO THE STARTUP HORROR - THE GAME");
        System.out.println("");
        System.out.println("");
        System.out.println("THIS GAME IS PLAYED BY ENTERING NUMBERS, CORRESPONDING TO ACTIONS NEXT TO THEM");
    System.out.println("");
    System.out.println("PLEASE SELECT AN OPTION...");
    System.out.println("1 - NEW GAME");
    System.out.println("2 - SETTINGS");
    System.out.println("3 - CREDITS");
}

private void menuRepeat(){
    System.out.println("PLEASE SELECT AN OPTION...");
    System.out.println("1 - NEW GAME");
    System.out.println("2 - SETTINGS");
    System.out.println("3 - CREDITS");
}



}
