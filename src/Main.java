import java.util.Scanner;
import BaseGame.DailyOption;
import OtherClasses.NumberGenerator;
import OtherClasses.TitleScreen;
import Projects.ProjectGenerator;
import settings.SettingsSelection;


/*

This is a mess. When I started making this game, God and I knew how it worked.
Now only God knows, so here is how many hours I wasted trying to figure out stuff:
* Why returns are not displaying any value (I didn't use any prints, so it had no way of DISPLAYING what it returns)  ~3 hours
* How to create setters and getters for project class, without doing them one by one (I ended up doing them one by one) - ~2 hours
* creating a generator for this Godforsaken projects: ~2 days
 */
public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();
DailyOption DailyOption1 = new DailyOption();
ProjectGenerator projects = new ProjectGenerator();
NumberGenerator test = new NumberGenerator();

//System.out.println(test1);
//stateOption.WelcomeScreen();
int readInput1 = 0;
int readInput2 = 0;
int readInput3 = 0;



projects.DifficultyGenerator();
projects.ProjectInfo();


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