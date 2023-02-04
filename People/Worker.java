package People;

import OtherClasses.NumberGenerator;
import People.Workers.Programmer;
import People.Workers.QATester;
import People.Workers.Seller;

import java.util.*;

public class Worker extends Person {
    Scanner select = new Scanner(System.in);

    // sooo how do i do this. Do i really want to have 18 fricking people in here?
    public List<String> workerNames = new ArrayList<>();
    public List<String> workerSuranes = new ArrayList<>();
    NumberGenerator randomizer = new NumberGenerator();

    public void Workers() {

        for (int i = 0; i <= 17; i++) {
            int valueOne = randomizer.NumberGeneratorValue2(10);
            int valueTwo = randomizer.NumberGeneratorValue2(10);
            workerNames.add(Name[valueOne]);
            workerSuranes.add(Surname[valueTwo]);
        }
    }

    // these are all possible workers.
    Programmer programmer1 = new Programmer();
    Programmer programmer2 = new Programmer();
    Programmer programmer3 = new Programmer();
    QATester tester1 = new QATester();
    Seller seller = new Seller();


    public void HireAWorker() {
        System.out.println("WHO DO YOU WANT TO HIRE?");
        System.out.println("1 - PROGRAMMER");
        System.out.println("2 - TESTER");
        System.out.println("3 - SELLER");
        try {
            int option = select.nextInt();
            switch (option) {
                case 1:
                    if (programmer1.isHired = false) {
                        programmer1.Name = workerNames.get(0);
                        programmer1.Surname = workerSuranes.get(0);
                        programmer1.cash = 250;
                        programmer1.isHired = true;
                    } else if (programmer2.isHired = false) {
                        programmer2.Name = workerNames.get(1);
                        programmer2.Surname = workerSuranes.get(1);
                        programmer2.cash = 250;
                        programmer2.isHired = true;
                    } else if (programmer3.isHired = false) {
                        programmer3.Name = workerNames.get(2);
                        programmer3.Surname = workerSuranes.get(2);
                        programmer3.cash = 250;
                        programmer3.isHired = true;
                    } else {
                        System.out.println("YOU CAN'T HIRE ANY MORE PROGRAMMERS");
                    }
                    break;
                case 2:
                    if (tester1.isHired = false) {
                    tester1.isHired = true;
                    tester1.pay = 150;
                    tester1.Name = workerNames.get(3);
                    tester1.Surname = workerSuranes.get(3);
                    }
                    else {
                        System.out.println("YOU CAN'T HIRE ANY MORE TESTERS");
                    }
                    break;
                case 3:
                    if (seller.isHired = false) {
                    seller.isHired = true;
                    seller.pay = 200;
                    seller.Name = workerNames.get(4);
                    seller.Surname = workerSuranes.get(4);
                    }
                    else {
                        System.out.println("YOU CAN'T HIRE ANY MORE SELLERS");
                    }
                    break;
                default:
                    System.out.println("Please select a valid option");
                    HireAWorker();
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Please use valid inputs");
            HireAWorker();
        }
    }

    public void FireAWorker() {
        System.out.println("WHO DO YOU WANT TO FIRE?");
        System.out.println("1 - PROGRAMMER");
        System.out.println("2 - TESTER");
        System.out.println("3 - SELLER");
        try {
            int option = select.nextInt();
            switch (option) {
                case 1:

    }



}