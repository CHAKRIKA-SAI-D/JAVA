//types
import java.util.Date;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
         Date date = calendar.getTime();

        System.out.println(date);
    }
}
//output
Thu Apr 18 13:37:22 GMT 2024
-------------------------------------------------------------------------
import java.util.Date;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, 9, 19, 12, 12, 12);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
//output
Sat Oct 19 12:12:12 GMT 2024
-----------------------------------------------------------------------------------
import java.util.Date;
import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2005);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DATE, 8);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        Date date = calendar.getTime();
        System.out.println(date);
    }
}
//output
Sat Jan 08 00:00:00 GMT 2005
---------------------------------------------------------------------------------------
