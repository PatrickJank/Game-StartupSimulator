public class NumberGenerator {
    // This one is used for randomizing numbers. I use this in the entire project

public int NumberGeneratorTest(int max, int min){
    int random_int = (int)Math.floor(Math.random() * (max - min + 1)+ min);
    return random_int;
}


}
