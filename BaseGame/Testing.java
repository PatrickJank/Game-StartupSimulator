package BaseGame;

import art.AsciiPictures;
import Projects.*;
import java.util.Scanner;
public class Testing {
    private Scanner select = new Scanner(System.in);
    private AsciiPictures BugDetected = new AsciiPictures();
ProjectGenerator test2 = new ProjectGenerator();

    public void TestingOptions() {
        System.out.println("Looking for bugs...do we focus on:");
        System.out.println("1 - Your code?");
        System.out.println("2 - subcontractor code?");
        System.out.println("3 - Your workers code?");
        int testType = select.nextInt();
        switch (testType) {
            case 1:
                System.out.println("Looking for bugs...");

            if(test2.bugFound==true){
                test2.testingForBugs();
                BugDetected.bugArt();
            }
            else{
                System.out.println("Nothing detected!");
            }





                break;
            case 2:
                System.out.println("PLACEHOLDER");
                BugDetected.bugArt();
                break;
            case 3:
                System.out.println("PLACEHOLDER");
                BugDetected.bugArt();
                break;
        }
    }
}
