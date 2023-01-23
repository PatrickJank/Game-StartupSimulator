import java.util.Scanner;
import BaseGame.DailyOption;
import OtherClasses.NumberGenerator;
import OtherClasses.TitleScreen;
import Projects.Project;
import Projects.ProjectTemplate;
import settings.SettingsSelection;


/*

This is a mess. When I started making this game, God and I knew how it worked.
Now only God knows, so here is how many hours I wasted trying to figure out stuff:
* Why returns are not displaying any value (I didn't use any prints, so it had no way of DISPLAYING what it returns)  ~3 hours
* How to create setters and getters for project class, without doing them one by one (i ended up doing them one by one) - ~2 hours
Sidenote: yandere simulator was made entirely with if-else so i guess it's still slightly better?
 */
public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();
DailyOption DailyOption1 = new DailyOption();
ProjectTemplate projects = new ProjectTemplate();
NumberGenerator test = new NumberGenerator();
Project test1 = new Project("A", "B");

//System.out.println(test1);
//stateOption.WelcomeScreen();
int readInput1 = 0;
int readInput2 = 0;
int readInput3 = 0;

System.out.println(test1.getProjectName());


        //actual game
/*
        while(readInput1 != 1) {
    readInput1 = select.nextInt();
stateOption.MainOptions(readInput1);
}
DailyOption1.DailyChoice();
*/
    }
}