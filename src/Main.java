import java.util.Scanner;
import settings.Settings;
import settings.SettingsSelection;

public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();


stateOption.WelcomeScreen();
int readInput = 0;
//color.SettingsSelectionOption();

/*
        while(readInput != 1) {
    readInput = select.nextInt();
stateOption.MainOptions(readInput);
}
*/



    }
}