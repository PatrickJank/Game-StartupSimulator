package OtherClasses;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dates {
    public static final Scanner select = new Scanner(System.in);




    public void enterDate() {
        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
        try{
            String kek = select.nextLine();
            Date date = DateFor.parse(kek);
            System.out.println("Date : "+date);
        }catch (ParseException e) {e.printStackTrace();}
    }

        public int AddDays(int value){
            return value;
        }


    }
