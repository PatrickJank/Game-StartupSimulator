import java.util.Scanner;
import BaseGame.DailyOption;
import OtherClasses.NumberGenerator;
import OtherClasses.TheGame;
import Projects.ProjectGenerator;
import settings.SettingsSelection;


/*

This is a mess. When I started making this game, God and I knew how it worked.
Now only God knows, so here is how many hours I wasted trying to figure out stuff:
* Why returns are not displaying any value (I didn't use any prints, so it had no way of DISPLAYING what it returns)  ~3 hours
* How to create setters and getters for project class, without doing them one by one (I ended up doing them one by one) - ~2 hours
* creating a generator for the Godforsaken projects: ~3 days
 */
public class Main {
    public static void main(String[] args) {

TheGame stateOption = new TheGame();
Scanner select = new Scanner(System.in);
SettingsSelection color = new SettingsSelection();
DailyOption DailyOption1 = new DailyOption();
ProjectGenerator projects = new ProjectGenerator();
NumberGenerator test = new NumberGenerator();
TheGame TheGame = new TheGame();
TheGame.TheGame();
//System.out.println(test1);
//stateOption.WelcomeScreen();
}}
