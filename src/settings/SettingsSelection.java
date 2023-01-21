package settings;
import java.util.Scanner;
public class SettingsSelection {
    Scanner select = new Scanner(System.in);

    public void Selection() {
this.welcome();
        int option = select.nextInt();
        if(option == 1)
        {
        Regularfont();
        }
        else if (option == 2)
        {
         Boldedfont();
        }
        else if (option == 3)
        {
        BackgroundColor();
        }
        else if (option == 4)
            System.out.print(Settings.RESET);
        else System.out.println("Please select a valid number");
    }

private void welcome(){
    System.out.println("SELECT YOUR DESIRED OPTION...");
    System.out.println("1 - REGULAR FONT");
    System.out.println("2 - BOLDED FONT");
    System.out.println("3 - BACKGROUND COLOR");
    System.out.println("4 - DEFAULT SETTINGS");
}

private void Regularfont(){
        System.out.println("Please select a color from the list bellow...");
        System.out.println("");
        System.out.println("1 - RED");
        System.out.println("2 - GREEN");
        System.out.println("3 - YELLOW");
        System.out.println("4 - BLUE");
        System.out.println("5 - MAGENTA");
        System.out.println("6 - CYAN");
        int option = select.nextInt();
    switch (option)
    {
        case 1:
            System.out.println(Settings.RED);
            break;
        case 2:
            System.out.println(Settings.GREEN);
            break;
        case 3:
            System.out.println(Settings.YELLOW);
            break;

        case 4:
            System.out.println(Settings.BLUE);
            break;
        case 5:
            System.out.println(Settings.MAGENTA);
            break;
        case 6:
            System.out.println(Settings.CYAN);
            break;
    }
}

    private void Boldedfont(){
        System.out.println("Please select a color from the list bellow...");
        System.out.println("");
        System.out.println("1 - BOLD RED");
        System.out.println("2 - BOLD GREEN");
        System.out.println("3 - BOLD YELLOW");
        System.out.println("4 - BOLD BLUE");
        System.out.println("5 - BOLD MAGENTA");
        System.out.println("6 - BOLD CYAN");
        int option = select.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(Settings.RED_BOLD);
                break;
            case 2:
                System.out.println(Settings.GREEN_BOLD);
                break;
            case 3:
                System.out.println(Settings.YELLOW_BOLD);
                break;

            case 4:
                System.out.println(Settings.BLUE_BOLD);
                break;
            case 5:
                System.out.println(Settings.MAGENTA_BOLD);
                break;
            case 6:
                System.out.println(Settings.CYAN_BOLD);
                break;
        }
    }
    private void BackgroundColor(){
        System.out.println("Please select a color from the list bellow...");
        System.out.println("");
        System.out.println("1 - RED BACKGROUND");
        System.out.println("2 - GREEN BACKGROUND");
        System.out.println("3 - YELLOW BACKGROUND");
        System.out.println("4 - BLUE BACKGROUND");
        System.out.println("5 - MAGENTA BACKGROUND");
        System.out.println("6 - CYAN BACKGROUND");
        int option = select.nextInt();
        switch (option)
        {
            case 1:
                System.out.println(Settings.RED_BACKGROUND);
                break;
            case 2:
                System.out.println(Settings.GREEN_BACKGROUND);
                break;
            case 3:
                System.out.println(Settings.YELLOW_BACKGROUND);
                break;

            case 4:
                System.out.println(Settings.BLUE_BACKGROUND);
                break;
            case 5:
                System.out.println(Settings.MAGENTA_BACKGROUND);
                break;
            case 6:
                System.out.println(Settings.CYAN_BACKGROUND);
                break;
        }
    }

}
