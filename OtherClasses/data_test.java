package OtherClasses;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class data_test {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
    Calendar calendar = new GregorianCalendar(2020, 0, 1);
    public void startingDate() {
        sdf.format(calendar.getTime());
        System.out.print(sdf.format(calendar.getTime()));
    }
    public void increase(int whatToIncrease, int howToIncrease){
        if(howToIncrease<0){
            System.out.println("You cannot go back in time.");
            System.exit(0);
        }
        calendar.add(whatToIncrease, howToIncrease);
    }
public void displayDate(){
    System.out.println(sdf.format(calendar.getTime()));
}


}
