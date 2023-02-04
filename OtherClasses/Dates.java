package OtherClasses;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.DATE;

public class Dates {
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd");
    public static Calendar calendar = new GregorianCalendar(2020, 0, 1);
    int i=0;

    public static void startingDate() {
        sdf.format(calendar.getTime());
        System.out.print(sdf.format(calendar.getTime()));
    }

    public static void increase(int howToIncrease) {
        if (howToIncrease < 0) {
            System.out.println("You cannot go back in time.");
            System.exit(0);
        }
        calendar.add(DATE, howToIncrease);
    }

    public int zusCheck() {
        i++;
        if (i >=31){
            i = 0;
        }
        return i;
    }




}
