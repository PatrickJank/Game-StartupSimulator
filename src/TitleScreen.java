public class TitleScreen {






    public void MainOptions(int option) {
        if(option == 1)
        {
            System.out.println("Test nowa gra");
            System.out.println("");
            menuRepeat();
        }
        else if (option == 2) {
            System.out.println("Test settings.Settings");
            System.out.println("");
            menuRepeat();
        }
        else if (option ==3) {
            System.out.println("Programmed by Patryk Jankiewicz");
            System.out.println("Tested by Patryk Jankiewicz");
            System.out.println("");
            menuRepeat();
        }

    }


public void WelcomeScreen(){
        System.out.println("WELCOME TO THE STARTUP HORROR - THE GAME");
        System.out.println("");
        System.out.println("");
        System.out.println("THIS GAME IS PLAYED BY ENTERING NUMBERS, CORRESPONDING TO ACTIONS NEXT TO THEM");
    System.out.println("");
    System.out.println("PLEASE SELECT AN OPTION...");
    System.out.println("1 - NEW GAME");
    System.out.println("2 - SETTINGS");
    System.out.println("3 - CREDITS");
}

public void menuRepeat(){
    System.out.println("PLEASE SELECT AN OPTION...");
    System.out.println("1 - NEW GAME");
    System.out.println("2 - SETTINGS");
    System.out.println("3 - CREDITS");
}


}
