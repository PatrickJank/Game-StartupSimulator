package BaseGame;


import java.util.Scanner;
public class Testing {
    private Scanner select = new Scanner(System.in);
public void TestingOptions(){
    System.out.println("Looking for bugs...do we focus on:");
    System.out.println("1 - Your code?");
    System.out.println("2 - subcontractor code?");
    System.out.println("3 - Your workers code?");
    int testType = select.nextInt();
    switch(testType){
        case 1:
            System.out.println("Looking for bugs...");
            bugArt();
            break;
        case 2:
            System.out.println("Looking for bugs...");
            bugArt();
            break;
        case 3:
            System.out.println("Looking for bugs...");
            bugArt();
            break;

    }



}


    private void bugArt() {
        System.out.println("    \\ //");
        System.out.println("     oVo");
        System.out.println("\\___XXX___//");
        System.out.println("  __XXXXX__");
        System.out.println("//__XXXXX__\\");
        System.out.println("//   XXX   \\");
        System.out.println("      V");
    }
}
