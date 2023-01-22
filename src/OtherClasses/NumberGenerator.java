package OtherClasses;

import java.util.Random;

public class NumberGenerator {
    // This one is used for randomizing numbers. I use this in the entire project
    private Random rd = new Random();
public int NumberGeneratorValue(int max, int min){
    int random_int = (int)Math.floor(Math.random() * (max - min + 1)+ min);
    return random_int;
}



public boolean NumberGeneratorBool(){
    boolean test = rd.nextBoolean();
    return test;
    }


}
