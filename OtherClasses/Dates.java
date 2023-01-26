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

    //by using local time and various technics i can set a starting time, assign it to a variable and then add days off of it. Ez pz
    public int startingYear() {
        // convert date to localdatetime
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        // plus one
        localDateTime = localDateTime.plusYears(-3).plusMonths(0).plusDays(0);
        int test = localDateTime.getYear();
        return test;

    }
    public String startingMonth(){
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        String test2 = localDateTime.getMonth().toString();
        while(test2 != "JANUARY"){
            localDateTime = localDateTime.plusMonths(-1);
            test2 = localDateTime.getMonth().toString();
        }
        return test2;
    }

    public int startingDay(){
        LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        // plus one
        int test3 = localDateTime.getDayOfMonth();
        while(test3 != 20){
            localDateTime = localDateTime.plusDays(-1);
            test3 = localDateTime.getDayOfMonth();
        }
        return test3;
    }
}



