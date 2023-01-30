package OtherClasses;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;

public class Dates {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
    static Calendar calendar = new GregorianCalendar(2020, 0, 1);
    public static void startingDate() {
        sdf.format(calendar.getTime());
        System.out.print(sdf.format(calendar.getTime()));
    }
    public static void increase(int howToIncrease){
        if(howToIncrease<0){
            System.out.println("You cannot go back in time.");
            System.exit(0);
        }
        calendar.add(Calendar.DATE,howToIncrease);
    }
public void displayDate(){
    System.out.println(sdf.format(calendar.getTime()));
}


}
