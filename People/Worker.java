package People;

import OtherClasses.NumberGenerator;

import java.util.*;

public class Worker extends Person {


    // sooo how do i do this. Do i really want to have 18 fricking people in here?
    public List<String> workerNames = new ArrayList<>();
    public List<String> workerSurames = new ArrayList<>();
    NumberGenerator randomizer = new NumberGenerator();

    public void testingAutomativeWorkers() {

        for (int i = 0; i <= 17; i++) {
            int valueOne = randomizer.NumberGeneratorValue2(10);
            int valueTwo = randomizer.NumberGeneratorValue2(10);
            workerNames.add(Name[valueOne]);
            workerSurames.add(Surname[valueTwo]);
        }

        for (String workerNames : workerNames) {
            System.out.println(workerNames);
        }
        System.out.println("test");
        System.out.println(workerNames.get(0));
    }
}
