
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BigNumber.Tool obj = new BigNumber().new Tool();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b: ");
        System.out.print("Enter a: ");
        String a = sc.nextLine();
        System.out.print("Enter b: ");
        String b = sc.nextLine();
        System.out.print("Enter result (check): ");
        String test = sc.nextLine();
        sc.close();
        if (test.equals(new BigNumber().div(a, b))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println("div(a,b) = " + new BigNumber().div(a, b));
    }
}
