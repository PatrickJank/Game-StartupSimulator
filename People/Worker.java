package People;

import BaseGame.Stats;
import OtherClasses.NumberGenerator;
import People.Workers.Programmer;
import People.Workers.QATester;
import People.Workers.Seller;
import People.Workers.Subcontractor;
import Projects.ProjectGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worker extends Person {
    Scanner select = new Scanner(System.in);
    Stats stats = new Stats();
    ProjectGenerator projectGenerator = new ProjectGenerator();

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

    Subcontractor contractor = new Subcontractor();

    public void HireAWorker() {
        Workers();
        System.out.println("WHO DO YOU WANT TO HIRE?");
        System.out.println("1 - PROGRAMMER");
        System.out.println("2 - TESTER");
        System.out.println("3 - SELLER");
        try {
            int option = select.nextInt();
            switch (option) {
                case 1:
                    if (!programmer1.isHired) {
                        programmer1.Name = workerNames.get(0);
                        programmer1.Surname = workerSuranes.get(0);
                        programmer1.cash = 250;
                        programmer1.isHired = true;
                        stats.currentWorkers++;
                    } else if (!programmer2.isHired) {
                        programmer2.Name = workerNames.get(1);
                        programmer2.Surname = workerSuranes.get(1);
                        programmer2.cash = 250;
                        programmer2.isHired = true;
                        stats.currentWorkers++;
                    } else if (!programmer3.isHired) {
                        programmer3.Name = workerNames.get(2);
                        programmer3.Surname = workerSuranes.get(2);
                        programmer3.cash = 250;
                        programmer3.isHired = true;
                        stats.currentWorkers++;
                    } else {
                        System.out.println("YOU CAN'T HIRE ANY MORE PROGRAMMERS");
                    }
                    break;
                case 2:
                    if (!tester1.isHired) {
                        tester1.isHired = true;
                        tester1.cash = 150;
                        tester1.Name = workerNames.get(3);
                        tester1.Surname = workerSuranes.get(3);
                        stats.currentWorkers++;
                    } else {
                        System.out.println("YOU CAN'T HIRE ANY MORE TESTERS");
                    }
                    break;
                case 3:
                    if (!seller.isHired) {
                        seller.isHired = true;
                        seller.cash = 200;
                        seller.Name = workerNames.get(4);
                        seller.Surname = workerSuranes.get(4);
                        stats.currentWorkers++;
                    } else {
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
        Workers();
        System.out.println("WHO DO YOU WANT TO FIRE?");
        System.out.println("1 - PROGRAMMER");
        System.out.println("2 - TESTER");
        System.out.println("3 - SELLER");
        try {
            int option = select.nextInt();
            switch (option) {
                case 1:

                    System.out.println("WHICH PROGRAMMER DO YOU WANT TO FIRE?");
                    System.out.println("1 - PROGRAMMER 1");
                    System.out.println("2 - PROGRAMMER 2");
                    System.out.println("3 - PROGRAMMER 3");
                    int option2 = select.nextInt();
                    switch (option2) {
                        case 1:
                            if (programmer1.isHired) {
                                programmer1.isHired = false;
                                stats.currentWorkers--;
                            }
                            else
                                System.out.println("SORRY BUT YOU CANNOT FIRE A WORKER YOU DO NOT HAVE");
                            break;
                        case 2:
                            if (programmer2.isHired) {
                                programmer2.isHired = false;
                                stats.currentWorkers--;
                            }
                            else
                                System.out.println("SORRY BUT YOU CANNOT FIRE A WORKER YOU DO NOT HAVE");
                            break;
                        case 3:
                            if (programmer3.isHired)
                            {
                                programmer3.isHired = false;
                                stats.currentWorkers--;
                            }
                            else
                                System.out.println("SORRY BUT YOU CANNOT FIRE A WORKER YOU DO NOT HAVE");
                            break;
                    }
                    break;
                case 2:
                    if (tester1.isHired) {
                        tester1.isHired = false;
                        stats.currentWorkers--;
                    }
                    else
                        System.out.println("SORRY BUT YOU CANNOT FIRE A WORKER YOU DO NOT HAVE");
                    break;
                case 3:
                    if (seller.isHired) {
                        seller.isHired = false;
                        stats.currentWorkers--;
                    }
                    else
                        System.out.println("SORRY BUT YOU CANNOT FIRE A WORKER YOU DO NOT HAVE");
                    break;
                default:
                    System.out.println("Please select a valid option");
                    FireAWorker();
                    break;
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Please use valid inputs");
            FireAWorker();
        }
    }

    public void work() {
        if (programmer1.isHired) {
            projectGenerator.workerWorking();
        }
        if (programmer2.isHired) {
            projectGenerator.workerWorking();
        }
        if (programmer3.isHired) {
            projectGenerator.workerWorking();
        }
        if (tester1.isHired) {
            projectGenerator.workerTesting();
        }
        if (seller.isHired) {
            stats.daysWasted++;
        }
    }

    public void HireAContractor() {
        System.out.println("A CONTRACTOR HAS BEEN HIRED THEY WILL HELP YOU ON YOUR PROJECT WITH PROGRAMMING AND FIXING HOWEVER THEY WILL COST A LOT");
        Workers();
        if (!contractor.isHired) {
            contractor.Name = workerNames.get(10);
            contractor.Surname = workerSuranes.get(10);
            contractor.cash = 750;
            contractor.isHired = true;
            stats.currentWorkers++;
        } else System.out.println("NOT POSSIBLE TO HIRE ANOTHER CONTRACTOR");
    }


    public void ContractorWorking() {
        if (contractor.isHired) {
            projectGenerator.workerWorking();
        }
    }

    public void workerPayment() {
        if (programmer1.isHired)
            stats.cash -= programmer1.cash;
        if (programmer2.isHired)
            stats.cash -= programmer2.cash;
        if (programmer3.isHired)
            stats.cash -= programmer3.cash;
        if (tester1.isHired)
            stats.cash -= tester1.cash;
        if (seller.isHired)
            stats.cash -= seller.cash;
        if (contractor.isHired)
            stats.cash -= contractor.cash;
    }
}

