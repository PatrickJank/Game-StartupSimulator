package OtherClasses;
import BaseGame.DailyOption;
import settings.SettingsSelection;
import java.util.Scanner;
public class TheGame extends DailyOption {
    SettingsSelection GoToSettings = new SettingsSelection();
    private final Scanner select = new Scanner(System.in);
// this is a test.

    private void MainOptions(int option1) {
        if (option1 == 1) {
            DailyChoice();
            SelectedOption();
            System.out.println("");
        } else if (option1 == 2) {
            System.out.println("");
            GoToSettings.Selection();
            menuRepeat();
        } else if (option1 == 3) {
            System.out.println("Design by Patryk Jankiewicz");
            System.out.println("Programed by Patryk Jankiewicz");
            System.out.println("Tested by Patryk Jankiewicz");
            System.out.println("Praying for the code to work: Patryk Jankiewicz");
            System.out.println("");
            menuRepeat();
        } else
            System.out.println("Please enter a valid number");

    }

    int readInput1 = 0;
    int readInput2 = 0;
    int readInput3 = 0;

    private void WelcomeScreen() {
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

    private void menuRepeat() {
        System.out.println("PLEASE SELECT AN OPTION...");
        System.out.println("1 - NEW GAME");
        System.out.println("2 - SETTINGS");
        System.out.println("3 - CREDITS");
    }


    public TheGame() {
        WelcomeScreen();
        while (readInput1 != 1) {
            readInput1 = select.nextInt();
            MainOptions(readInput1);
        }

    }
}
