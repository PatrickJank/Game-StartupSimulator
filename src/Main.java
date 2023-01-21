import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

TitleScreen stateOption = new TitleScreen();
Scanner select = new Scanner(System.in);
stateOption.WelcomeScreen();
int readInput = 0;
        while(readInput != 1) {
    readInput = select.nextInt();
stateOption.MainOptions(readInput);
}

    }
}