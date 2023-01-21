import java.util.Scanner;
import settings.Settings;
import settings.SettingsSelection;

public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();


stateOption.WelcomeScreen();
int readInput1 = 0;
int readInput2 = 0;
int readInput3 = 0;

        while(readInput1 != 1) {
    readInput1 = select.nextInt();
stateOption.MainOptions(readInput1);
}



    }
}