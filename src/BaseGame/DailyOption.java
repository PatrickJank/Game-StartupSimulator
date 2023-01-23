package BaseGame;
import settings.Settings;
import java.util.Scanner;

public class DailyOption {
int x = 5;
Scanner select = new Scanner(System.in);
Testing debug = new Testing();

    public void DailyChoice(){
        System.out.println("SELECT AN ACTIVITY FOR TODAY...");
        System.out.println("");
        System.out.println("1 - SIGN A CONTRACT FOR A NEW PROJECT");
        System.out.println("2 - LOOK FOR A CLIENT - "+ x +"DAYS LEFT");
        System.out.println("3 - SPEND THE DAY PROGRAMING STUFF");
        System.out.println("4 - SPEND THE DAY TESTING CODE");
        System.out.println("5 - GIVE THE CLIENT A FINISHED PRODUCT");
        System.out.println("6 - HIRE A NEW WORKER");
        System.out.println("7 - FIRE A WORKER");
        System.out.println("8 - SPEND THE DAY DEALING WITH AUTHORITIES/LEGAL STUFF");
        System.out.println("9 - CHECK STATS");
        SelectedOption();
    }

    public void SelectedOption(){
        int option = select.nextInt();
        switch (option)
        {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;

            case 4:
                debug.TestingOptions();

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
        }





    }


}
