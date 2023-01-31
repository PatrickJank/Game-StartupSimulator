package OtherClasses;

import java.util.Random;

public class NumberGenerator {
    private Random rd = new Random();


//This generates from 0 to a max value. It ALWAYS starts from 0. This is why i add "1" to it.

    public int NumberGeneratorValue2(int max) {
        int rand_int = rd.nextInt(max + 1);
        return rand_int;
    }

    //This generates a random coin toss
    public boolean NumberGeneratorBool() {
        boolean test = rd.nextBoolean();
        return test;
    }


}
