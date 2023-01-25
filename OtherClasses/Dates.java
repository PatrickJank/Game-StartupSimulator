package OtherClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


import static org.junit.Assert.assertEquals;

public class Dates {
    private static final String DATE_FORMAT = "yyyy/MM/dd HH:mm:ss";
    private static final DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    private static final DateTimeFormatter dateFormat8 = DateTimeFormatter.ofPattern(DATE_FORMAT);

    // Get current date
    Date currentDate = new Date();


    public void pleaseWork() {


        // convert date to localdatetime
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime : " + dateFormat8.format(localDateTime));

        // plus one
        localDateTime = localDateTime.plusYears(-3).plusMonths(0);
        //by using local time and various technics i can set a starting time, assign it to a variable and then add days off of it. Ez pz
       System.out.println(localDateTime.getDayOfMonth());
        // convert LocalDateTime to date
        Date currentDatePlusOneDay = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("\nOutput : " + dateFormat.format(currentDatePlusOneDay));
    }
}
