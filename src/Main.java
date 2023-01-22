import java.util.Scanner;
import BaseGame.DailyOption;
import Projects.ProjectTemplate;
import settings.SettingsSelection;

public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();
DailyOption DailyOption1 = new DailyOption();
ProjectTemplate projects = new ProjectTemplate();
NumberGenerator test = new NumberGenerator();


//stateOption.WelcomeScreen();
int readInput1 = 0;
int readInput2 = 0;
int readInput3 = 0;


int Name =test.NumberGeneratorTest(0,11);
int Description =test.NumberGeneratorTest(0,11);
        projects.projects(Name, Description);
/*
        while(readInput1 != 1) {
    readInput1 = select.nextInt();
stateOption.MainOptions(readInput1);
}
DailyOption1.DailyChoice();
*/
    }
}