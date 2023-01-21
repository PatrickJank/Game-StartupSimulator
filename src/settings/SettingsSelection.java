package settings;
public class SettingsSelection {


    public void SettingsSelectionOption(int option) {
this.welcome();
        if(option == 1)
        {


        }
        else if (option == 2)
        {


        }
        else if (option == 3)
        {


        }
        else System.out.println("Please select a valid number");
    }


public void welcome(){
    System.out.println("SELECT YOUR DESIRED OPTION...");
    System.out.println("1 - REGULAR FONT");
    System.out.println("2 - BOLDED FONT");
    System.out.println("3 - BACKGROUND COLOR");
}

public void Regularfont(){
        System.out.println("Please select a color from the list bellow...");
        System.out.println("");
        System.out.println("1 - RED");
        System.out.println("2 - GREEN");
        System.out.println("3 - YELLOW");
        System.out.println("4 - BLUE");
        System.out.println("5 - MAGENTA");
        System.out.println("6 - CYAN");
        System.out.println("7 - WHITE");

}

}
