package version1;

import java.util.HashMap;
import java.util.Scanner;


/*
@author Unify Williams (Jing Tian)
    version 1.0 : console program
    -   Not using Database
    -   Not using MVC
    -   Not having GUI
    -   Not using 3 - Layer
    -   Using local file (FileInputStream and FileOutputStream).
 */
public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

//    static {
//        new HouseholdDAO().write(new HashMap<>());
//    }
    public static void main(String[] args) {

        printMenu();
        Management_Households manage = new Management_Households();
        while (true) {
            System.out.print(ANSI_GREEN + "[administrator ~] $ " + ANSI_RESET);
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "show":
                    manage.showInforamation();
                    break;
                case "add":
                    manage.add();
                    break;
                case "remove":
                    System.out.print("key? - ");
                    manage.remove(new Scanner(System.in).nextLine());
                    break;
                case "find":
                    manage.find();
                    break;
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("The choose is invalid.");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Command:");
        System.out.println(ANSI_RED + "show" + ANSI_RESET + " show list all the households.");
        System.out.println(ANSI_RED + "add" + ANSI_RESET + " add the households.");
        System.out.println(ANSI_RED + "remove" + ANSI_RESET + " the household by key");
        System.out.println(ANSI_RED + "find" + ANSI_RESET + " Displaying a screen "
                + "of information about households in the neighborhood this year, "
                + "there are people celebrating life expectancy (80 years).");
        System.out.println(ANSI_RED + "exit" + ANSI_RESET + " exit the program.");
    }
}
