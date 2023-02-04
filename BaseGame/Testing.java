package BaseGame;

import art.AsciiPictures;
import Projects.*;
import java.util.Scanner;
public class Testing {
    private Scanner select = new Scanner(System.in);
    private AsciiPictures BugDetected = new AsciiPictures();
ProjectGenerator test2 = new ProjectGenerator();

    public void TestingOptions() {
        System.out.println("Looking for bugs...");
                System.out.println("Looking for bugs...");
            if(test2.bugFound==true){
                test2.testingForBugs();
                BugDetected.bugArt();
                test2.bugFound = true;
            }
            else{
                System.out.println("Nothing detected!");
                BugDetected.myszojeleń();
        }
    }
}
