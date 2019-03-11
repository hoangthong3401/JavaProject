package version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
@author Unify Williams (Jing Tian)
    version 1.0 : console program
    -   Not using Database
    -   Not using MVC
    -   Not having GUI
    -   Not using 3 - Layer

 */
public class Main {

    static Management_Households manage = new Management_Households();
    static List<Member> lsMembers = new ArrayList<>();
    static HashMap<String, Household> lsHouseholds = new HashMap<>();

    static {
        try {
            lsMembers.add(new Member("Nguyen Van A", "Coder", new SimpleDateFormat("dd/mm/yyyy").parse("25/05/1998")));
            lsMembers.add(new Member("Nguyen Thi B", "Hacker", new SimpleDateFormat("dd/mm/yyyy").parse("11/05/1995")));
            lsMembers.add(new Member("Nguyen Van Hai C", "Tester", new SimpleDateFormat("dd/mm/yyyy").parse("24/09/1997")));
            lsMembers.add(new Member("Nguyen Van Anh D", "Manager", new SimpleDateFormat("dd/mm/yyyy").parse("1/11/1964")));
            lsMembers.add(new Member("Nguyen Van Vu E", "Coder", new SimpleDateFormat("dd/mm/yyyy").parse("03/05/1968")));
            lsMembers.add(new Member("Nguyen Ngoc F", "Coder", new SimpleDateFormat("dd/mm/yyyy").parse("09/04/1979")));
            lsMembers.add(new Member("Nguyen Thi Thuy H", "Tester", new SimpleDateFormat("dd/mm/yyyy").parse("14/10/1998")));
        } catch (ParseException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        Household h = new Household(new Management_Households().generation(), lsMembers);
        lsHouseholds.put(h.getHouseNumber(), h);
        manage.setLsHouseholds(lsHouseholds);
    }

    public static void main(String[] args) {
        manage.showInforamation();
        manage.add();
        manage.showInforamation();
    }
}
