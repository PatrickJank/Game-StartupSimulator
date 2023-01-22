package OtherClasses;

import java.util.Random;

public class NumberGenerator {
    private Random rd = new Random();

    //This does not generate 0! Only use if generated values need to be greater than 0
public int NumberGeneratorValue(int max, int min){
    int random_int = (int)Math.floor(Math.random() * (max - min + 1)+ min);
    return random_int;
}

//This generates from 0 to a max value. It ALWAYS starts from 0.
public int NumberGeneratorValue2(int max){
    int rand_int = rd.nextInt(max+1);
    return rand_int;
}

//This generates a random coin toss
public boolean NumberGeneratorBool(){
    boolean test = rd.nextBoolean();
    return test;
    }


}
