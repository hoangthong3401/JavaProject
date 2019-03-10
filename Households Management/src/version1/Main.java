package version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Unify Williams (Jing Tian)
 */

/*

    version 1.0 : console program
    -   Not using Database
    -   Not using MVC
    -   Not having GUI
    -   Not using 3 - Layer

 */
public class Main {

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date = null;
        try {
            date = sdf.parse("11/01/2002");
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
//        try {
//            date = sdf.parse("11/01/2002");
//        } catch (ParseException ex) {
//            System.err.println("Error!!!");
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        System.out.println("Dob: " + sdf.format(date));
        System.out.println("Day birth: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Molth birth:" + calendar.get(Calendar.MONTH));
        System.out.println("Year birth: " + calendar.get(Calendar.YEAR));
        System.out.println("Year now " + Year.now().getValue());
    }
}
