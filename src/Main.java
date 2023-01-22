import java.util.Scanner;
import BaseGame.DailyOption;
import OtherClasses.NumberGenerator;
import OtherClasses.TitleScreen;
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
int Name =test.NumberGeneratorValue(0,11);
int Description =test.NumberGeneratorValue(0,11);

//stateOption.WelcomeScreen();
int readInput1 = 0;
int readInput2 = 0;
int readInput3 = 0;



boolean status = test.NumberGeneratorBool();
//projects.projects(Name, Description);
System.out.println(test.NumberGeneratorBool());

/*
        while(readInput1 != 1) {
    readInput1 = select.nextInt();
stateOption.MainOptions(readInput1);
}
DailyOption1.DailyChoice();
*/
    }
}